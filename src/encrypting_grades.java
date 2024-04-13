import java.util.Scanner;

public class encrypting_grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char grade = sc.next().charAt(0);
        grade = (char)(grade+8);

        System.out.println("The encrypted grade is: "+grade);

    }
}
