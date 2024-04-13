import java.util.Scanner;
public class cbse_per_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks in English");
        int eng = sc.nextInt();

        System.out.println("Enter your marks in Hindi");
        int hin = sc.nextInt();

        System.out.println("Enter your marks in Maths");
        int maths = sc.nextInt();

        float percent;
        percent = (float) ((eng + hin + maths) * 100) /300;

        System.out.println("The percentage of the Student is: "+percent);
    }
}
