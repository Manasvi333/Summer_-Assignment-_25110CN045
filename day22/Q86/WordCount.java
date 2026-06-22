package day22.Q86;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("Number of words = 0");
        } else {
            String[] words = sentence.split("\\s+");
            System.out.println("Number of words = " + words.length);
        }

        sc.close();
    }
}