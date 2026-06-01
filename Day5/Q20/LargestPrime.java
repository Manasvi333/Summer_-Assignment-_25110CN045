package Day5.Q20;
import java.util.Scanner;

public class LargestPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int largestPrimeFactor = 1;

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                largestPrimeFactor = i;
                n = n / i;
            }
        }

        System.out.println("Largest Prime Factor = " + largestPrimeFactor);

        sc.close();
    }
}