package Day2.Q7;
import java.util.Scanner;
public class product { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int product = 1;
        while (n > 0) {
            int rem = n % 10;
            product = product * rem;
            n = n / 10;
        }
        System.out.println("Product of the digits of the given number = " + product);
    }
    
}
