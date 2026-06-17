package LambdaQuestions;

import java.util.Arrays;
import java.util.List;

public class FilterOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7,8,7,9,6,4,1,2,3,6,47,8,9,5,54,6,6,5,6,45,5,8,9,9,6,5,6,6,5,65,26,32,362);
        System.out.println("Odd numbers in Array : ");
        numbers.stream()
                .filter(num-> num%2!=0)
                .forEach(num-> System.out.print(num + "  "));
    }
}
