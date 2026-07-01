package day30.Q119;
import java.util.Scanner;

public class MiniEmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] empId = new int[10];
        String[] empName = new String[10];
        double[] salary = new double[10];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== MINI EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < 10) {

                        System.out.print("Enter Employee ID: ");
                        empId[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        empName[count] = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        salary[count] = sc.nextDouble();

                        count++;

                        System.out.println("Employee Added Successfully.");
                    } else {
                        System.out.println("Employee List is Full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Employee Records Found.");
                    } else {
                        System.out.println("\n===== Employee Records =====");

                        for (int i = 0; i < count; i++) {
                            System.out.println("----------------------------");
                            System.out.println("Employee ID   : " + empId[i]);
                            System.out.println("Employee Name : " + empName[i]);
                            System.out.println("Salary        : ₹" + salary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == searchId) {
                            System.out.println("\nEmployee Found:");
                            System.out.println("Employee ID   : " + empId[i]);
                            System.out.println("Employee Name : " + empName[i]);
                            System.out.println("Salary        : ₹" + salary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Mini Employee Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}