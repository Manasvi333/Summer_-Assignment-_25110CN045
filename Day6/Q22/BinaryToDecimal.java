package Day6.Q22;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(length - 1 - i);
            if (bit == '1') {
                decimal += Math.pow(2, i);  
            }
        }
        System.out.println("Decimal representation: " + decimal);
        sc.close();
    }
}