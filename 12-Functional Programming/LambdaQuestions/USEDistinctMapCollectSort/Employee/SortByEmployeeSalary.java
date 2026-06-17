package LambdaQuestions.USEDistinctMapCollectSort.Employee;

import java.util.Comparator;
import java.util.List;

public class SortByEmployeeSalary {
    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("Deekesh",100000)
        ,new Employee("Devendra",90000)
        ,new Employee("Sagar",75000)
        ,new Employee("Manish",70000)
        ,new Employee("Lucky",85000)
        ,new Employee("Pushpendra",60000)
        );

        employees.stream().sorted((emp1,emp2)-> (int) (emp1.getSalary()-emp2.getSalary())).forEach(System.out::println);
    }
}
