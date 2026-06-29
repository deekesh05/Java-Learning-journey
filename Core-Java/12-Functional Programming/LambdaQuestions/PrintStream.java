package LambdaQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,5,89,78,56,24);
        System.out.println("Print Normally ");
        numbers.stream()
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.print(integer + "  ");
                    }
                });
        System.out.println();
        System.out.println("Print By Using Lambda");
        numbers.stream()
                .forEach(number -> System.out.print(number + "  "));

    }
}
