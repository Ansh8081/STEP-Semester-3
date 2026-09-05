package session4.assignment;
import java.util.Scanner;
public class FindMinimum {
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
        int left=0;
        int right=n-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[right])
                left=mid+1;
            else
                right=mid;
        }
        System.out.println("Minimum Element: "+nums[left]);
        sc.close();
    }
}