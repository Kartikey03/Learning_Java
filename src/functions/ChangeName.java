package functions;

import java.util.Scanner;

public class ChangeName {
    static Scanner sc = new Scanner(System.in);

    static String change(){
        System.out.print("Enter the new name: ");
        String newname = sc.nextLine();
        return newname;
    }

    public static void main(String[] args) {

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Tha name you entered is "+name);
        System.out.println("Do you want to change the name?");
        System.out.println("press 'y' for YES and 'n' for NO" );
        String inp = sc.nextLine();
        if (inp.equals("y")){
            String naam = change();
            System.out.println("The new name is : "+naam);
        }
        else{
            System.out.println("The name is not changed and the old name is : "+name);
        }

    }
}
