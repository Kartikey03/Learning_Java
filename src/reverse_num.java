import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to make it reverse:");
        int n = sc.nextInt();
        int sum=0;
        int temp;
        while (n>0){
            temp = n%10;
            sum = (sum*10)+temp;
            n=n/10;
        }
        System.out.println(sum);

    }
}
