package LambdaQuestions;

import java.util.List;

public class SumOfSquaresOfNumbers {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6);
        int result = nums.stream().filter(num -> num%2==0 )
                .map(num->num*num)
                .reduce(0,(a,b)-> a+b);
        System.out.println(result);

    }
}
