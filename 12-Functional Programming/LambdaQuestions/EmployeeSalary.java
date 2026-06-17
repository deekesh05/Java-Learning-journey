package LambdaQuestions;

import java.util.List;

class EmployeeSalary {
    private String name;
    private double salary;

    public EmployeeSalary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " : " + salary;
    }

    public static void main(String[] args) {
        List<EmployeeSalary> employeeSalaries = List.of(new EmployeeSalary("Deeksh",100000)
                ,new EmployeeSalary("Devendra" , 60000)
                ,new EmployeeSalary("Lucky" , 30000)
                ,new EmployeeSalary("Sagar" , 40000));
        employeeSalaries.stream().filter(emp -> emp.getSalary()>50000)
                .forEach(employeeSalary -> System.out.println(employeeSalary.getName()  + " : " + employeeSalary.getSalary() ));
    }
}