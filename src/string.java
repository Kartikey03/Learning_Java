import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        System.out.println("""
                Select the operation you want to perform:
                1. Convert to lowercase
                2. Convert to UPPERCASE
                3. Replace something in the String""");

        int n = sc.nextInt();
        if (n==1){
            lower(s);
        }
        else if (n==2){
            upper(s);
        }
    }

    //program to convert a string to lowercase
    public static void lower(String sr) {
        System.out.println("The lowercase String is : "+ sr.toLowerCase());
    }
    public static void upper(String s){
        System.out.println("The uppercase String is : "+ s.toUpperCase());
    }
}
