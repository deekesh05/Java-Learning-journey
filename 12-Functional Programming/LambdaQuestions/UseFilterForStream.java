package LambdaQuestions;

import java.util.Arrays;
import java.util.List;

public class UseFilterForStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Deekesh","Devendra","Dhanendra","Manish","Jyoti");
        names.stream()
                .filter(s -> s.length()>=7).forEach(s -> System.out.println(s));
        String result = names.stream()
                .filter(s -> s.length()>=7)
                .reduce("", (a,b)-> a + " " + b)
                .trim();
        System.out.println(result);
    }
}
