package session10.classwork;
import java.util.Scanner;
public class LeapYearDetector {
    static int enteryear(Scanner sc){
        int n=sc.nextInt();
        sc.nextLine();
        if(n<0||n>10000){
            System.out.println("Invalid year!");
            return enteryear(sc);
        }
        else{
            return n;
        }
    }
    static String isleap(int n){
        if(n%400==0||(n%4==0&&n%100!=0))
            return "Leap year";
        else
            return "Not a leap year";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of years: ");
        int n=sc.nextInt();
        sc.nextLine();
        int[] a=new int[n];
        System.out.println("Enter years");
        for(int i=0;i<n;i++){
            a[i]=enteryear(sc);
        }
        System.out.println("Leap Stauts");
        for(int A:a){
            System.out.println(isleap(A));
        }
        sc.close();
    }
}
