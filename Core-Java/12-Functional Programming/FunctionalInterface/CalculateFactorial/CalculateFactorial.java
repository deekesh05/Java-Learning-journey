package FunctionalInterface.CalculateFactorial;

import java.util.stream.IntStream;

public class CalculateFactorial {
    public static void main(String[] args) {
        CalculateFactorial cal = new CalculateFactorial();
        int number = 5;
        System.out.println(cal.fact(number));
        IntStream.rangeClosed(2,number)
                .reduce((a,b)-> a*b)
                .ifPresent(System.out::println);



    }
    Long fact(int num)
    {
        int fact = 1;
        if(num == 0 || num == 1)
        {
            return 1L;
        }
        for (int i = 1; i <= num; i++) {
            fact*=i;
        }
        return (long) fact;
    }
}
