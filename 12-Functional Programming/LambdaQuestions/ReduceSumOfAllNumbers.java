package LambdaQuestions;

import java.util.List;

public class ReduceSumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        int result = list.stream().reduce(0,(a,b)-> a+b);
        System.out.println("Sum of all numbers : " + result);

        //for product
        int multi = list.stream().reduce(1,(a,b)->a*b);
        System.out.println("Product of all Numbers : " + multi);
        // for Maximum
        int max = list.stream().reduce(Integer.MIN_VALUE,(a,b)-> (a < b)? b:a);
        System.out.println(max);
    }
}
