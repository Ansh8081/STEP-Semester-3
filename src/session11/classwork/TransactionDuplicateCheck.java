package session11.classwork;
import java.util.HashSet;
public class TransactionDuplicateCheck {
    static boolean hasDuplicate(String[] transactionIds){
        for(int i=0;i<transactionIds.length;i++){
            for(int j=i+1;j<transactionIds.length;j++){
                if(transactionIds[i].equals(transactionIds[j]))
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] transaction1={"TXN1001", "TXN1002", "TXN1003", "TXN1002", "TXN1004"};
        String[] transaction2={"TXN2001", "TXN2002", "TXN2003"};
        System.out.println("Method 1");
        HashSet<String> set=new HashSet<>();
        HashSet<String> seti=new HashSet<>();
        boolean status=false;
        for(int i=0;i<transaction1.length;i++){
            if(!set.add(transaction1[i])){
                status=true;
                break;
            }
        }
        System.out.println(status);
        status=false;
        for(int i=0;i<transaction2.length;i++){
            if(!seti.add(transaction2[i])){
                status=true;
                break;
            }
        }
        System.out.println(status);
        status=false;
        System.out.println("Method 2");
        System.out.println(hasDuplicate(transaction1));
        System.out.println(hasDuplicate(transaction2));
    }
}
