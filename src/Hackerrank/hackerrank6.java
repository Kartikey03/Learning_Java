package Hackerrank;

public class hackerrank6 {
    public static void main(String[] args) {
        int number = 123;

        // Using String.valueOf() method
        String str1 = String.valueOf(number);
        System.out.println("Using String.valueOf(): " + str1);

        // Using concatenation with an empty string
        String str2 = number + "";
        System.out.println("Using concatenation: " + str2);
    }
}
