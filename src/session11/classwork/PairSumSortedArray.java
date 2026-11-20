package session11.classwork;
public class PairSumSortedArray {
    static void pairSumSorted(int[] nums,int target){
        boolean status=false;
        int left=0,right=nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]==target){
                status=true;
                break;
            }
            else if(nums[left]+nums[right]>target){
                right--;
            }
            else if(nums[left]+nums[right]<target){
                left++;
            }
        }
        if(status){System.out.println("("+nums[left]+", "+nums[right]+")");}
        else{System.out.println("Not Found");}
    }
    public static void main(String[] args) {
        int[] nums={-4, -1, 0, 3, 5, 9};
        int[] num={1,2,3};
        pairSumSorted(nums,4);
        pairSumSorted(num,100);
    }
}
