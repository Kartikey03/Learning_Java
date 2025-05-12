package Leetcode;

public class Sol5 {
    public static int searchInsert(int[] nums, int target) {
        int low = nums[0];
        int high = nums[nums.length-1];
        int mid = low + (high - low) / 2;
        for(int i=0; i<nums.length; i++){
            //edge case
            if (nums[i]== target){
                return i;
            } else if (target < mid) {
                high = mid;
            }
        }
        return 5;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 3;

        int n = searchInsert(nums, target);
        System.out.println(n);
    }
}
