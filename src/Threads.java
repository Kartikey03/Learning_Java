//this is a thread by extending the thread class
public class Threads extends Thread{
    public void run(){
        System.out.println("This is inside the thread class");
        for (int i = 0; i < 10; i++) {
            System.out.println("get the f out");

        }
    }

    public static void main(String[] args) {
        Threads th = new Threads();

        Threads2 obj = new Threads2();
        Thread th2 = new Thread(obj);

        System.out.println("This is outside the thread");
        th.start();
        th2.start();
        System.out.println("this is also outside the thread");
    }

}

//this is a thread by implementing a runnable interface
class Threads2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("This is inside the runnable interface");
        }

    }
}
