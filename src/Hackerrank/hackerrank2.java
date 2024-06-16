package Hackerrank;

import java.util.Scanner;

public class hackerrank2{
    public static void main(String[] args){
        int i;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (i=1; i<11; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }


    }
}