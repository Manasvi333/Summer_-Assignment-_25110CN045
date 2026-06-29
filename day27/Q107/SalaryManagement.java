package day27.Q107;
import java.util.Scanner;

public class SalaryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ₹");
        double basicSalary = sc.nextDouble();

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double pf = basicSalary * 0.12;

        double grossSalary = basicSalary + hra + da;
        double netSalary = grossSalary - pf;

        System.out.println("\n===== Salary Details =====");
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : ₹" + basicSalary);
        System.out.println("HRA (20%)     : ₹" + hra);
        System.out.println("DA (10%)      : ₹" + da);
        System.out.println("PF (12%)      : ₹" + pf);
        System.out.println("Gross Salary  : ₹" + grossSalary);
        System.out.println("Net Salary    : ₹" + netSalary);

        sc.close();
    }
}