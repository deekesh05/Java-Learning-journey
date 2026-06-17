package ExecutorService.FixedThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestFixedThread {
    public static void main(String[] args) throws InterruptedException {
        try (ExecutorService service = Executors.newFixedThreadPool(2)) {
            PrintTask task1 = new PrintTask();

            for (int i = 1; i <= 10; i++) {
                service.submit(task1);
            }

            service.shutdown();

            try {
                if (!service.awaitTermination(15, TimeUnit.SECONDS)) {
                    service.shutdownNow();
                }
            } catch (InterruptedException e) {
                System.out.println(e.getCause() + e.getMessage());
            }
        }


    }
}
