package Leetcode;

import java.util.Scanner;

public class Sol3 {
    public static int numArr(int[] nums, int k){
        int count = 0;
        int[] newarr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 != 0){
                count++;
            }
            newarr[i] = nums[i];
            if (count == k){

                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Arr = new int[5];
        for (int i = 0; i < 5; i++) {
            Arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int ans = numArr(Arr, k);
        System.out.println(ans);
    }
}
