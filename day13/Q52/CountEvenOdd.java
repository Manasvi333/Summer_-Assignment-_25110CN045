package day13.Q52;

import java.util.Scanner;

public class CountEvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements = " + evenCount);
        System.out.println("Number of odd elements = " + oddCount);

        scanner.close();
    }
}