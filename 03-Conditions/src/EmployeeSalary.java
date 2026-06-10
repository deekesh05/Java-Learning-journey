import java.util.Scanner;

public class EmployeeSalary {
    public  static  long hra(long salary)
    {
        return ((salary/100)*20);
    }
    public  static  long da(long salary)
    {
        return ((salary/100)*10);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Salary : ");
        long basic = input.nextLong();
        System.out.println();
        long totalSalary = basic+hra(basic)+da(basic);
        if(totalSalary>50000)
        {
            System.out.println("High Salary : " + totalSalary);
        }
        else
        {
            System.out.println("Normal Salary : " + totalSalary);
        }

    }
}
