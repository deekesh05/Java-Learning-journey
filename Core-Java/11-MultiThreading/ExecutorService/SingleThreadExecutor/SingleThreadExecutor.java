package ExecutorService.SingleThreadExecutor;

public class SingleThreadExecutor implements Runnable{
//    private final String symbol;
//
//    public SingleThreadExecutor(String symbol) {
//        this.symbol = symbol;
//    }

    @Override
    public void run() {
        System.out.println("Start printing " );
        for (int i = 1; i <= 10; i++) {
            System.out.printf( "%d ",i);
        }
        System.out.printf("\n Task Completed " + Thread.currentThread().getName());
    }
}
