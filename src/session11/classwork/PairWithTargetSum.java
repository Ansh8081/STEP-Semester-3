package session11.classwork;
import java.util.HashSet;
public class PairWithTargetSum {
    static boolean hasPairWithSum(int[] nums,int target){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(target-nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    static boolean hasPairWithSumv2(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Method 1");
        int[] nums = {2, 7, 11, 15};
        int[] nums1={3, 4, 6};
        System.out.println(hasPairWithSum(nums, 9));
        System.out.println(hasPairWithSum(nums1, 20));
        System.out.println("Method 2");
        System.out.println(hasPairWithSumv2(nums, 9));
        System.out.println(hasPairWithSumv2(nums1, 20));
    }
}
