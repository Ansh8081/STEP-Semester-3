package session4.assignment;
import java.util.Scanner;
import java.util.HashMap;
public class SubarraySum {
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
        System.out.print("Enter K: ");
        int k=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k))
                count+=map.get(sum-k);

            if(map.containsKey(sum))
                map.put(sum,map.get(sum)+1);
            else
                map.put(sum,1);
        }
        System.out.println("Number of Subarrays: "+count);
        sc.close();
    }
}