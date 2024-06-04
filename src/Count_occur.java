import java.util.Scanner;

public class Count_occur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int count = 0;

        while(n>0){
            if (n%10== 7) {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
