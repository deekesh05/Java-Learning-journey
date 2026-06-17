package LambdaQuestions.USEDistinctMapCollectSort.UseMap;

import java.util.List;

public class SquareOfNumberUsingMap {
    public static void main(String[] args) {
        List<String> numbers = List.of("2","3","4","5","6","2","3","7","9","8","10","12","3","3","5","7");
        numbers.stream()
                .map(Integer::parseInt)
                .map(num->Math.pow(num,2))
                .reduce(Double::sum)
                .ifPresent(System.out::println);
    }
}
