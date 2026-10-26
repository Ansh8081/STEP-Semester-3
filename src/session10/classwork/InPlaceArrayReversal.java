package session10.classwork;
import java.util.Scanner;
public class InPlaceArrayReversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number count in list: ");
        int n=sc.nextInt();
        sc.nextLine();
        int[] a=new int[n];
        System.out.print("Enter list: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.nextLine();
        for(int i=0;i<n/2;i++){
            int temp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;
        }
        System.out.print("Reversed list: ");
        for(int A:a){
            System.out.print(A+" ");
        }
        sc.close();
    }
}
