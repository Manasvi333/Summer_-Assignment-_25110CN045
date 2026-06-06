package Day4.Q16;
import java.util.Scanner;
public class rangearmstrong { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int lower = sc.nextInt();

        System.out.print("Enter the upper limit: ");
        int upper = sc.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + ":");
        for (int num = lower; num <= upper; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }

        sc.close();
    }

    public static boolean isArmstrong(int num) {
        int temp = num;
        int count = 0;

        // Count digits
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = num;
        int sum = 0;

        // Calculate sum of digits raised to count
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp = temp / 10;
        }

        return sum == num;
    }
    
}
