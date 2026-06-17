package ExecutorService.ReturningFuture;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestFuture {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            List <Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                FactorialCalculator task = new FactorialCalculator(i);
                list.add(service.submit(task));
            }
            for (Future<Integer> integerFuture : list) {
                System.out.println("Result is : " + integerFuture.get());
            }
            service.shutdown();
            if(!service.awaitTermination(15, TimeUnit.SECONDS))
            {
                System.out.println("Are Bas kr broo ");
                service.shutdownNow();
            }

        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
