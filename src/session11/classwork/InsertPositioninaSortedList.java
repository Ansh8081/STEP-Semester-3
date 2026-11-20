package session11.classwork;
public class InsertPositioninaSortedList{
    static int searchInsertPosition(int[] nums,int target){
        int min=0,max=nums.length-1;
        int med=min+(max-min)/2;
        while(min<=max){
            if(nums[med]>target){
                max=med-1;
                med=min+(max-min)/2;
            }
            else if(nums[med]<target){
                min=med+1;
                med=min+(max-min)/2;
            }
            else
                return med;
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsertPosition(nums, 5));
        System.out.println(searchInsertPosition(nums, 2));
    }
}
