package calcuator;

import java.util.Scanner;

public class calc_prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Select the Operator::
                1. + (Add)
                2. - (Subtract)
                3. x (Multiply)
                4. / (Divide)
                """);
        int n = sc.nextInt();

        System.out.println("Enter the number of Operands:");
        int i = sc.nextInt();

        int[] opr = new int[i+1];
        for (int j = 1; j < i+1; j++) {
            System.out.println("Enter operand " +j+":");
            opr[j]= sc.nextInt();
        }

        //addition
        if (n==1){
            int sum = 0;
            for (int element : opr) {
                sum += element;
            }
            System.out.println("The sum is "+sum);
        } else if (n==2) {
            int sub = opr[0]-opr[1];
            System.out.println(sub);
        }

    }
}
