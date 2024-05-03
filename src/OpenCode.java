import java.util.Scanner;

public class OpenCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array elements:");
        for (int i = 0; i <size ; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("The array is:");
        for (int i = 0; i <size ; i++) {
            System.out.print(+arr[i]);
        }
    }
}
