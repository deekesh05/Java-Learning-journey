package ExecutorService.FixedThreadExecutor;

public class PrintTask  implements Runnable{
    private final int random = (int) (Math.random() * 5) + 1;

    @Override
    public void run() {
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);
            System.out.println(threadName + " is Sleeping for : " + random);
            Thread.sleep(random* 1000L);
        } catch (InterruptedException e) {
            System.out.println("Error Interrupted : " + e.getMessage());
        }
    }
}
