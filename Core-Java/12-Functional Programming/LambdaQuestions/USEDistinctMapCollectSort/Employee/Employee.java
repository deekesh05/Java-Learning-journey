package LambdaQuestions.USEDistinctMapCollectSort.Employee;

public class Employee {
    private final String name;
    private final double Salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return Salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
