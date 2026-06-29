package day27.Q106;
import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        double bonus = salary * 0.10;
        double totalSalary = salary + bonus;

        System.out.println("\n===== Employee Details =====");
        System.out.println("Employee ID      : " + id);
        System.out.println("Employee Name    : " + name);
        System.out.println("Department       : " + department);
        System.out.println("Basic Salary     : ₹" + salary);
        System.out.println("Bonus (10%)      : ₹" + bonus);
        System.out.println("Total Salary     : ₹" + totalSalary);

        sc.close();
    }
}