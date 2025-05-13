package Patterns;

public class InvertHalfPyrmd {
    public static void main(String[] args) {
        int n=4;
        int m=4;
        //outer loop
        for (int i = 1; i <= n ; i++) {
            //inner loop
            for (int j = m; j >= i ; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
