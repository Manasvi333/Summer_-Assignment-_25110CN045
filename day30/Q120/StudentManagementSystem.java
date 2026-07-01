package day30.Q120;
import java.util.Scanner;

public class StudentManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static int[] roll = new int[20];
    static String[] name = new String[20];
    static double[] marks = new double[20];
    static int count = 0;

    public static void addStudent() {

        if (count >= 20) {
            System.out.println("Student Record is Full.");
            return;
        }

        System.out.print("Enter Roll Number: ");
        roll[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextDouble();

        count++;

        System.out.println("Student Added Successfully.");
    }

    public static void displayStudents() {

        if (count == 0) {
            System.out.println("No Records Found.");
            return;
        }

        System.out.println("\n===== STUDENT RECORDS =====");

        for (int i = 0; i < count; i++) {
            System.out.println("--------------------------");
            System.out.println("Roll No : " + roll[i]);
            System.out.println("Name    : " + name[i]);
            System.out.println("Marks   : " + marks[i]);
        }
    }

    public static void searchStudent() {

        System.out.print("Enter Roll Number: ");
        int search = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (roll[i] == search) {
                System.out.println("\nStudent Found");
                System.out.println("Roll No : " + roll[i]);
                System.out.println("Name    : " + name[i]);
                System.out.println("Marks   : " + marks[i]);
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public static void calculateAverage() {

        if (count == 0) {
            System.out.println("No Records Available.");
            return;
        }

        double sum = 0;

        for (int i = 0; i < count; i++) {
            sum += marks[i];
        }

        System.out.println("Average Marks = " + (sum / count));
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Calculate Average Marks");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    calculateAverage();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}