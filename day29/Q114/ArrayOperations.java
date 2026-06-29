package day29.Q114;
import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n===== ARRAY OPERATIONS MENU =====");
            System.out.println("1. Display Array");
            System.out.println("2. Find Maximum");
            System.out.println("3. Find Minimum");
            System.out.println("4. Calculate Sum");
            System.out.println("5. Calculate Average");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Array: ");
                    for (int num : arr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    int max = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Maximum = " + max);
                    break;

                case 3:
                    int min = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.println("Minimum = " + min);
                    break;

                case 4:
                    int sum = 0;
                    for (int num : arr) {
                        sum += num;
                    }
                    System.out.println("Sum = " + sum);
                    break;

                case 5:
                    int total = 0;
                    for (int num : arr) {
                        total += num;
                    }
                    double average = (double) total / n;
                    System.out.println("Average = " + average);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}