import java.util.Scanner;

public class speed_formula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter final velocity:");
        int v = sc.nextInt();
        System.out.println("enter initial velocity");
        int u = sc.nextInt();
        System.out.println("enter acceleration");
        int a = sc.nextInt();
        System.out.println("enter displacement");
        int s = sc.nextInt();

        int speed = ((v*v)-(u*u))/(2*a*s);

        System.out.println("The speed is: "+speed);


    }
}
