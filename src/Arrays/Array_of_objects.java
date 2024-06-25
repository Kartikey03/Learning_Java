package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_of_objects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //this is the array of objects (no primitives)
        String[] arr = new String[5];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 3; i++) {
            String str = arr[i];
            System.out.print(str+" ");
        }
    }
}
