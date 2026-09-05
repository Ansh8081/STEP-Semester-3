package session4.assignment;
import java.util.Scanner;
import java.util.Arrays;
public class ThreeSum {
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
        Arrays.sort(nums);
        boolean x=false;
        for(int i=0;i<n-2;i++){
            if(i>0&&nums[i]==nums[i-1])
                continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    System.out.println("["+nums[i]+","+nums[j]+","+nums[k]+"]");
                    x=true;
                    while(j<k&&nums[j]==nums[j+1])
                        j++;
                    while(j<k&&nums[k]==nums[k-1])
                        k--;
                    j++;
                    k--;
                }
                else if(sum<0)
                    j++;
                else
                    k--;
            }
        }
        if(!x)
            System.out.println("No triplets found");
        sc.close();
    }
}