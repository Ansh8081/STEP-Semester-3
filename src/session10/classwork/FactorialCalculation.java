package session10.classwork;
import java.util.Scanner;
public class FactorialCalculation {
    static int getnumber(Scanner sc){
        int n=sc.nextInt();
        sc.nextLine();
        if(n>=0)
            return n;
        else{
            System.out.println("Invalid Number!");
            return getnumber(sc);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter count of numbers: ");
        int n=sc.nextInt();
        sc.nextLine();
        int[] a=new int[n];
        System.out.println("Enter non negative integer numbers");
        for(int i=0;i<n;i++){
            a[i]=getnumber(sc);
            if(a[i]==1||a[i]==0)
                a[i]=1;
            else{
                for(int j=a[i]-1;j>0;j--){
                    a[i]*=j;
                }
            }
        }
        System.out.println("Factorials");
        for(int A:a){
            System.out.println(A);
        }
        sc.close();
    }
}

