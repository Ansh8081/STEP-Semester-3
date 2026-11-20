package session11.classwork;
import java.util.HashSet;
public class RemoveDuplicatesSortedArray {
    static void removeDuplicates(int[] nums){
        int duplicate=0,length=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                duplicate++;
            }
        }
        for(int i:set){
            System.out.print(i+" ");
            length++;
        }
        System.out.println("\nLength = "+length+"\nDuplicate = "+duplicate);
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        removeDuplicates(nums);
    }
}
