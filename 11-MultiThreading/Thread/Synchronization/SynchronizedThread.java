package Thread.Synchronization;
public class SynchronizedThread extends Thread{
    private Counter counter;

    public SynchronizedThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
