package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_of_primitives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr; //array declaration ......at compile time
        arr = new int[5]; //array initialization......at runtime

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //the loop below is known as the for each loop
        for(int num : arr){
            System.out.print(num + " ");
        }


        //another way of printing an array is the Arrays package
        System.out.println(Arrays.toString(arr));

    }
}
