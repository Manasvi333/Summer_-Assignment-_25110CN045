package day26.Q104;
import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;
        int answer;

        System.out.println("===== Java Quiz =====");

        // Question 1
        System.out.println("\n1. Which keyword is used to create an object in Java?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. static");
        System.out.println("4. this");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 2) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which data type stores whole numbers?");
        System.out.println("1. int");
        System.out.println("2. float");
        System.out.println("3. char");
        System.out.println("4. boolean");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 1) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which loop is guaranteed to execute at least once?");
        System.out.println("1. for");
        System.out.println("2. while");
        System.out.println("3. do-while");
        System.out.println("4. foreach");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 3) {
            score++;
        }

        // Question 4
        System.out.println("\n4. Which method is the entry point of a Java program?");
        System.out.println("1. start()");
        System.out.println("2. init()");
        System.out.println("3. main()");
        System.out.println("4. run()");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 3) {
            score++;
        }

        // Question 5
        System.out.println("\n5. Java is a ______ language.");
        System.out.println("1. Procedural");
        System.out.println("2. Object-Oriented");
        System.out.println("3. Assembly");
        System.out.println("4. Machine");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 2) {
            score++;
        }

        System.out.println("\n===== Quiz Finished =====");
        System.out.println("Your Score: " + score + " out of 5");

        sc.close();
    }
}