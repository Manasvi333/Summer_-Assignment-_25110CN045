package day22.Q87;
import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Character Frequencies:");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 1;

            if (ch == ' ')
                continue;

            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (str.charAt(k) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted)
                continue;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            System.out.println(ch + " = " + count);
        }

        sc.close();
    }
}