package Day7.Q26;
import java.util.Scanner;
public class recursivefibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position in Fibonacci sequence: ");
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
        sc.close();
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}   