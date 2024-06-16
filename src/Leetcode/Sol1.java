package Leetcode;
import java.util.Arrays;
import java.util.Scanner;

public class Sol1 {
    public static void minPatches(int[] newarr, int n, int arrSize) {
        if (Arrays.stream(newarr).sum() == n){
            System.out.println(Arrays.toString(newarr));
        }
        else{
            arrSize++;
            int[] nums2 = Arrays.copyOf(newarr, arrSize);
            int i=1;
            nums2[nums2.length-1] = i;
            minPatches(nums2, n, arrSize);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size:");
        int arrSize = sc.nextInt();
        int[] nums = new int[arrSize];
        System.out.println("enter the array elements:");
        for (int i = 0; i < arrSize; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("enter the value of n:");
        int n = sc.nextInt();

        minPatches(nums,n, arrSize);
    }
}
