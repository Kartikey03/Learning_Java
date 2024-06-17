package Questions;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        int factor = 0;
        for (int i = 1; i <= n ; i++) {
            if (n%i==0){
                factor++;
            }
        }
        if (factor == 2){
            System.out.println("Yes, it is a Prime Number.");

        }
        else{
            System.out.println("No, it is not a Prime Number");
        }
    }
}
