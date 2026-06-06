package Day7.Q28;
import java.util.Scanner;
public class recursivereverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        String result = reverseString(input);
        System.out.println("Reversed string: " + result);
        sc.close();
    }
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}    