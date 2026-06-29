package day27.Q105; 
import java.util.Scanner;

public class StudentRecord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        System.out.println("\n===== Student Record =====");
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Course       : " + course);
        System.out.println("Marks        : " + marks);

        if (marks >= 40) {
            System.out.println("Result       : Pass");
        } else {
            System.out.println("Result       : Fail");
        }

        sc.close();
    }
}