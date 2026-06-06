package Day1.Q4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0) {
            int rem = n % 10;
            n = n / 10;
            count++;
        }
        System.out.println("digits in a number = " + count);
    }
}
