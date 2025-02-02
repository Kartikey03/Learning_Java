import java.util.LinkedList;
import java.util.Scanner;
//jasmeet = jasmet

public class Main {
    public static String pallin(String name){
        String s = "";
        char ch;
        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            s = ch+s;
        }
        if(s.equals(name)){
            return "true";
        }
        else{
            return "false";
        }

    }
    public static void main(String[] args) {
        String sd = pallin("aman");
        System.out.println(sd);

    }
}
