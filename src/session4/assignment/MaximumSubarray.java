package session4.assignment;
import java.util.Scanner;
public class MaximumSubarray {
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
        int current=nums[0];
        int maximum=nums[0];
        for(int i=1;i<n;i++){
            if(current+nums[i]>nums[i])
                current=current+nums[i];
            else
                current=nums[i];
            if(current>maximum)
                maximum=current;
        }
        System.out.println("Maximum Subarray Sum: "+maximum);
        sc.close();
    }
}