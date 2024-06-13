import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number :");
        int a = sc.nextInt();
        System.out.println("Enter another Number :");
        int b = sc.nextInt();

        try{
            int c = a/b;
            System.out.println("The answer is : "+c);
        }
        catch (Exception e){
            System.out.println("the exception occured : "+e);
        }
        System.out.println("end of the program");


    }
}
