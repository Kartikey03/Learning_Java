public class ThreadSleep extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("the thread is running");
        }
        try {
            Thread.sleep(10000);
        }
        catch (Exception e){}
    }
    public static void main(String[] args) {
        ThreadSleep th = new ThreadSleep();
        for (int i = 0; i < 10; i++) {
            System.out.println("outside the thread");
        }
        th.start();
    }
}
