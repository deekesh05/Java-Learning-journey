package LambdaQuestions;

import java.util.function.BinaryOperator;

public class MultiplicationWithLambda {
    public static void main(String[] args) {
        BinaryOperator<Integer> multi =  (a , b)-> a*b;
        double result  = multi.apply(5,6);
        System.out.println(result);
    }
}
