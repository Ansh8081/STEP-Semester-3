package session4.classwork;
import java.util.Scanner;
public class DuplicateCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Students: ");
        int n=sc.nextInt();
        sc.nextLine();
        int[] rollnum=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Roll Number of Student "+(i+1)+": ");
            rollnum[i]=sc.nextInt();
            sc.nextLine();
        }
        boolean x=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n&&j!=i;j++){
                if(rollnum[i]==rollnum[j]){
                    x=true;
                    break;
                }
            }
            if(x)
                break;
        }
        System.out.println("Duplicate Status: "+x);
        sc.close();
    }
}