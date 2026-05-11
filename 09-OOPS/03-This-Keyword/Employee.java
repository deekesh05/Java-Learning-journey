class Employee {

    String name;
    int salary;

    // Constructor
    Employee(String name, int salary) {

        // this keyword refers current object

        // Left side -> Instance Variable
        // Right side -> Local Variable

        this.name = name;
        this.salary = salary;
    }

    // Method
    void display() {

        System.out.println("Employee Name   : " + name);
        System.out.println("Employee Salary : " + salary);
    }

    public static void main(String[] args) {

        // Object Create
        Employee e1 = new Employee("Aman", 50000);

        e1.display();
    }
}