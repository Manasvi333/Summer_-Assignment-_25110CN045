package day25.Q98;
import java.util.Scanner;

public class CommonCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("Common Characters:");

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (str1.charAt(k) == ch) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted)
                continue;

            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2.charAt(j)) {
                    System.out.print(ch + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}