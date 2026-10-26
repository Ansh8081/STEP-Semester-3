package session10.classwork;
import java.util.Scanner;
public class PrimeNumberChecker{
    static int enternumber(Scanner sc){
        int n=sc.nextInt();
        sc.nextLine();
        if(n>1)
            return n;
        else{
            System.out.println("Invalid number!");
            return enternumber(sc);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter count of numbers: ");
        int n=sc.nextInt();
        sc.nextLine();
        int[] a=new int[n];
        System.out.println("Enter integer numbers greater than 1");
        for(int i=0;i<n;i++){
            a[i]=enternumber(sc);
        }
        for(int A:a){
            boolean b=true;
            for(int i=2;i<A;i++){
                if(A%i==0){
                    System.out.println(A+" is not prime");
                    b=false;
                    break;
                }
            }
            if(b)
                System.out.println(A+" is prime");
        }
        sc.close();
    }
}
