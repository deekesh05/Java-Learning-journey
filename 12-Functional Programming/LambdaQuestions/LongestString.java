package LambdaQuestions;

import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> words = List.of("Java", "Programming", "Lambda", "Stream");
        String longeststr =  words.stream().reduce(words.get(0),(a,b)-> a.length()>b.length() ? a :b);
        System.out.println(longeststr);
    }
}
