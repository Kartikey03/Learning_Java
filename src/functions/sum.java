package functions;

import java.util.Scanner;

public class sum {

    int sum(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        a = sc.nextInt();
        System.out.println("enter a number again");
        b = sc.nextInt();
        int s = a+b;
        return s;
    }

    static int sum2(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
//        System.out.println("The sum is "+sum());

        int sum = sum2(20,40);
        System.out.println(sum);

    }
}
