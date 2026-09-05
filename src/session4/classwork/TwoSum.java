package session4.classwork;
import java.util.Scanner;
public class TwoSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Products: ");
        int n=sc.nextInt();
        sc.nextLine();
        int[] prices=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter price "+(i+1)+": ");
            prices[i]=sc.nextInt();
            sc.nextLine();
        }
        System.out.print("Enter Target: ");
        int target=sc.nextInt();
        boolean x=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n&&j!=i;j++){

                if(prices[i]+prices[j]==target){
                    System.out.println("["+i+","+j+"]");
                    x=true;
                    break;
                }
            }
            if(x)
                break;
        }
        sc.close();
    }
}