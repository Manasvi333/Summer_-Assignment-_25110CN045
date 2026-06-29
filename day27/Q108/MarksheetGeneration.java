package day27.Q108;
import java.util.Scanner;

public class MarksheetGeneration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter marks in Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int sub3 = sc.nextInt();

        System.out.print("Enter marks in Subject 4: ");
        int sub4 = sc.nextInt();

        System.out.print("Enter marks in Subject 5: ");
        int sub5 = sc.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = total / 5.0;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("\n========= MARKSHEET =========");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("------------------------------");
        System.out.println("Subject 1 : " + sub1);
        System.out.println("Subject 2 : " + sub2);
        System.out.println("Subject 3 : " + sub3);
        System.out.println("Subject 4 : " + sub4);
        System.out.println("Subject 5 : " + sub5);
        System.out.println("------------------------------");
        System.out.println("Total      : " + total + "/500");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);

        if (percentage >= 40) {
            System.out.println("Result     : PASS");
        } else {
            System.out.println("Result     : FAIL");
        }

        sc.close();
    }
}