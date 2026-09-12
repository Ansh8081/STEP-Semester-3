package session1.classwork;
import java.util.Scanner;
public class ReverseCustomerName{
    static String reverseCustomerName(String customerName){
        // StringBuilder sb=new StringBuilder(customerName);
        // return sb.reverse().toString();
        char[] arr=new char[customerName.length()];
        int j=0;
        for(int i=(customerName.length()-1);i>=0;i--){
            arr[j]=customerName.charAt(i);
            j++;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name=sc.next();
        System.out.println("Original Name: "+name+"\nReversed Name: "+reverseCustomerName(name));
        sc.close();
    }
}
