import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        System.out.println("enter hindi marks:");
        Scanner hindi = new Scanner(System.in);
        int h = hindi.nextInt();

        System.out.println("enter eng marks:");
        Scanner eng = new Scanner(System.in);
        int e = eng.nextInt();

        System.out.println("enter maths marks:");
        Scanner maths = new Scanner(System.in);
        int m = maths.nextInt();

        int percentage;
        percentage = ((e+m+h)*100)/300;
        System.out.println("The percentage is " + percentage+"%");
    }
}
