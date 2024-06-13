import java.util.Arrays;
import java.util.Scanner;

public class TryCatch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        System.out.println("enter the array index: ");
        int n=sc.nextInt();

        System.out.println("Enter the array elements: ");
        try{
            for (int i = 0; i < n ; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The total index of the array can be 3, you gave more");
        }



    }
}
