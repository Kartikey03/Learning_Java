package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Sol4 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] n1 = new int[m];
        int[] n2 = new int[n];

        for (int i = 0; i < m; i++) {
            if (nums1[i]!=0) {
                n1[i] = nums1[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums2[i]!=0) {
                n2[i] = nums2[i];
            }
        }


        int index = 0;

        for (int i = 0; i < n1.length; i++) {
            nums1[index++] = n1[i];
        }

        for (int i = 0; i < n2.length; i++) {
            nums1[index++] = n2[i];
        }
        Arrays.sort(nums1);



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};


        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}
