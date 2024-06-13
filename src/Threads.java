
public class Threads extends Thread{
    public void run(){
        System.out.println("hello world");
        for (int i = 0; i < 10; i++) {
            System.out.println("get the f out");

        }
    }

    public static void main(String[] args) {
        Threads th = new Threads();
        System.out.println("hello wotrkds");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        th.start();
    }

}
