package LambdaQuestions;

import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {

        List<Integer> nums = List.of(10, 25, 60, 90, 75, 90);

        Integer secondHighest = nums.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(secondHighest);
    }
}