//program to find the largest number in the array
import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lar = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lar){
                lar = arr[i];
            }
        }
        System.out.println("The largest number is " + lar);
    }
}
