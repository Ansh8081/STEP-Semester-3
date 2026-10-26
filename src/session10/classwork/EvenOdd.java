package session10.classwork;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int odd=0,even=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter natural number count in list: ");
        int n=sc.nextInt();
        sc.nextLine();
        int[] a=new int[n];
        System.out.print("Enter list of natural numbers: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0)
                even++;
            else
                odd++;
        }
        sc.nextLine();
        System.out.println("Even: "+even+"\nOdd: "+odd);
        sc.close();
    }
}
