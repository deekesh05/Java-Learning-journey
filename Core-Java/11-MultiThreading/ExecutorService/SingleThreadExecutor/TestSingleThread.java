package ExecutorService.SingleThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleThread {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {

            SingleThreadExecutor task1 = new SingleThreadExecutor();
            SingleThreadExecutor task2 = new SingleThreadExecutor();
            SingleThreadExecutor task3 = new SingleThreadExecutor();


            service.submit(task1);
            service.submit(task2);
            service.submit(task3);


            service.shutdown();
        }
    }
}
