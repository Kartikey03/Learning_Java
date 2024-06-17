package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 'c' to check and press 'p' to print the armstrong numbers");
        String check = sc.nextLine();

        if (check.equals("c")) {
            CheckArm();
        } else if (check.equals("p")) {
            PrintArm();
        }
        sc.close();
    }

    static void CheckArm() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int m = n;
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum = sum + (d * d * d);
            n = n / 10;
        }
        if (sum == m) {
            System.out.println("Yes, it is an Armstrong number");
        } else {
            System.out.println("No, it is not an Armstrong number");
        }
        sc.close();
    }

    static void PrintArm() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();
        List<Integer> armstrongNumbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int j = i;
            while (j > 0) {
                int d = j % 10;
                sum = sum + (d * d * d);
                j = j / 10;
            }
            if (sum == i) {
                armstrongNumbers.add(i);
            }
        }

        System.out.println("Armstrong numbers up to " + n + ": " + armstrongNumbers);
        sc.close();
    }
}
