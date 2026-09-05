package session4.assignment;
import java.util.Scanner;

public class ProductExceptSelf {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n=sc.nextInt();
        sc.nextLine();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Element "+(i+1)+": ");
            nums[i]=sc.nextInt();
            sc.nextLine();
        }
        int[] answer=new int[n];
        int product=1;
        for(int i=0;i<n;i++){
            answer[i]=product;
            product*=nums[i];
        }
        product=1;
        for(int i=n-1;i>=0;i--){
            answer[i]*=product;
            product*=nums[i];
        }
        System.out.println("Product Except Self:");
        for(int i=0;i<n;i++){
            System.out.println(answer[i]);
        }
        sc.close();
    }
}