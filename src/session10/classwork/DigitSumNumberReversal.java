package session10.classwork;
import java.util.Scanner;
public class DigitSumNumberReversal {
    static int enterpositive(Scanner sc){
        System.out.print("Enter a Positive number: ");
        int n=sc.nextInt();
        sc.nextLine();
        if(n>0)
            return n;
        else{
            System.out.println("Invalid Number!");
            return enterpositive(sc);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=enterpositive(sc);
        int sum=0,reverse=0;
        while(n!=0){
            sum+=n%10;
            reverse+=n%10;
            if(n/10!=0){
                reverse*=10;
            }
            n/=10;
        }
        System.out.println("Sum of digits: "+sum+"\nReverse: "+reverse);
        sc.close();
    }
}
