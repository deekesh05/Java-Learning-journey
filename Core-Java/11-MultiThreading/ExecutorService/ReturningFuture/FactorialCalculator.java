package ExecutorService.ReturningFuture;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Integer> {
    private final int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        if(number<=1)
        {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact*=i;
        }
        return fact;
    }
}
