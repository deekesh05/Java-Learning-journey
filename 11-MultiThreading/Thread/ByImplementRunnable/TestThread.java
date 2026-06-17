package Thread.ByImplementRunnable;

public class TestThread {
    public static void main(String[] args) {
        Threads p1 = new Threads("*");
        Threads p2 = new Threads("$");
        Threads p3 = new Threads("#");

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);

        t1.start();
        t2.start();
        t3.start();

    }
}
