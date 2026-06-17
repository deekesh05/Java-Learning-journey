package LambdaQuestions;

import java.util.List;

public class FilterNamesStartWithA {
    public static void main(String[] args) {
        List<String> names = List.of("Aman", "Rahul", "Akash", "Vivek", "Ankit");
        names.stream()
                .filter(str -> str.startsWith("A"))
                .forEach(str-> System.out.print(str + "  "));
    }
}
