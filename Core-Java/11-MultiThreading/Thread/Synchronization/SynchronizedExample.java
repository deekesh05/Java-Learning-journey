package Thread.Synchronization;

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        SynchronizedThread t1 = new SynchronizedThread(counter);
        SynchronizedThread t2 = new SynchronizedThread(counter);

        long startTime = System.currentTimeMillis();
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Count is : " + counter.getCount());
        long endTime = System.currentTimeMillis();
        int totalTime = (int)(endTime-startTime);
        System.out.println("Total Time : " + totalTime );

    }
}
