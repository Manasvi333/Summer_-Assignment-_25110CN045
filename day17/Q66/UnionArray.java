package day17.Q66;
import java.util.Scanner;

public class UnionArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Union of Arrays:");

        for (int i = 0; i < n1; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr1[i] + " ");
            }
        }

        for (int i = 0; i < n2; i++) {
            boolean found = false;

            for (int j = 0; j < n1; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                boolean duplicate = false;

                for (int j = 0; j < i; j++) {
                    if (arr2[i] == arr2[j]) {
                        duplicate = true;
                        break;
                    }
                }

                if (!duplicate) {
                    System.out.print(arr2[i] + " ");
                }
            }
        }

        sc.close();
    }
}