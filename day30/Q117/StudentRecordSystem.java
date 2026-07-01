package day30.Q117;
import java.util.Scanner;

public class StudentRecordSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] rollNo = new int[n];
        String[] name = new String[n];
        double[] marks = new double[n];

        // Input student records
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Roll Number: ");
            rollNo[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            name[i] = sc.nextLine();

            System.out.print("Marks: ");
            marks[i] = sc.nextDouble();
        }

        // Display records
        System.out.println("\n===== STUDENT RECORDS =====");

        for (int i = 0; i < n; i++) {
            System.out.println("----------------------------");
            System.out.println("Roll Number : " + rollNo[i]);
            System.out.println("Name        : " + name[i]);
            System.out.println("Marks       : " + marks[i]);
        }

        sc.close();
    }
}