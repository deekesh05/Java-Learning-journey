package LambdaQuestions;

import java.util.List;

class Employees {
    String name;
    String department;
    double salary;

    public Employees(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        List<Employees> employees = List.of(new Employees("Deekesh","IT",100000)
                ,new Employees("Devendra","IT",70000)
                ,new Employees("Sagar","Machanical",65000)
                ,new Employees("vedu","Electrical",80000)
                ,new Employees("Jay","IT",40000));
        double total = employees.stream().filter(Employees-> Employees.getDepartment().equals("IT"))
                .map(emp-> emp.getSalary())
                .reduce(0.0,(a,b)-> a+b);
        System.out.println(total);

        double highestPaid = employees.stream()
                .map(emp-> emp.getSalary())
                .reduce(0.0,(a,b)-> a<b ? b : a);
        System.out.println(highestPaid);
    }
}
