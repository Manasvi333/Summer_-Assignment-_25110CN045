package Day11.Q42;
import java.util.Scanner;

public class MaxFunction {

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = max(num1, num2);

        System.out.println("Maximum number = " + result);

        sc.close();
    }
}