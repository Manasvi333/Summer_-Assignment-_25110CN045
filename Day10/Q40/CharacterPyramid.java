package Day10.Q40;
import java.util.Scanner;
public class CharacterPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the character pyramid: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            // Ascending characters
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }

            // Descending characters
            for (char ch = (char)('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }
        scanner.close();
    }
}