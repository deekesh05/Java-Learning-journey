package LambdaQuestions.USEDistinctMapCollectSort.UseDistinct;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {
    public static void main(String[] args) {
        List <Integer> arr = List.of(1,2,4,5,3,6,9,2,1,5,4);
        List<Integer> distinctArr = arr.stream()
                                        .distinct()
                                        .collect(Collectors.toList());
        System.out.println(distinctArr);
    }
}
