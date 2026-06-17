package Thread.Questions.question102;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        CreateThreads t1 = new CreateThreads(Signals.RED);
        CreateThreads t3 = new CreateThreads(Signals.YELLOW);
        CreateThreads t2 = new CreateThreads(Signals.GREEN);


        t1.start();
        t1.join();
        t3.start();
        t3.join();
        t2.start();
        t2.join();
    }



}
