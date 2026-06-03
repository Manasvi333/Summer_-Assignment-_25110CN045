package Day7.Q27;
import java.util.Scanner;
public class recursivesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the sum of its digits: ");
        int number = sc.nextInt();
        int result = sumOfDigits(number);
        System.out.println("The sum of the digits of " + number + " is: " + result);
        sc.close();
    }
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
}   