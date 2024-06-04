import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the fruit name:");
        String fruit = sc.next();

        //i used "alt+enter" shortcut to enhance this switch syntax
        switch (fruit) {
            case "mango" -> System.out.println("fruits ka RAJA");
            case "apple" -> System.out.println("keeps the doctor away");
            case "grapes" -> System.out.println("meethe angoor");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}
