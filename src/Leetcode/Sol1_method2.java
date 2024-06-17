package Leetcode;
public class Sol1_method2 {
    public int minPatches(int[] nums, int n) {
        int patches = 0;
        long missing = 1; // Use long to prevent overflow
        int i = 0;

        while (missing <= n) {
            if (i < nums.length && nums[i] <= missing) {
                missing += nums[i];
                i++;
            } else {
                missing += missing;
                patches++;
            }
        }
        return patches;
    }

    public static void main(String[] args) {
        Sol1_method2 solution = new Sol1_method2();

        // Example 1
        int[] nums1 = {1, 3};
        int n1 = 6;
        System.out.println(solution.minPatches(nums1, n1)); // Output: 1

        // Example 2
        int[] nums2 = {1, 5, 10};
        int n2 = 20;
        System.out.println(solution.minPatches(nums2, n2)); // Output: 2

        // Example 3
        int[] nums3 = {1, 2, 2};
        int n3 = 5;
        System.out.println(solution.minPatches(nums3, n3)); // Output: 0
    }
}
