package Day10.Q39;
import java.util.Scanner;
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the number pyramid: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            // Ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
        scanner.close();
    }
}
    