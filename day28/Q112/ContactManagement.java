package day28.Q112;
import java.util.Scanner;

public class ContactManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        String[] phones = new String[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < 10) {
                        System.out.print("Enter Contact Name: ");
                        names[count] = sc.nextLine();

                        System.out.print("Enter Phone Number: ");
                        phones[count] = sc.nextLine();

                        count++;
                        System.out.println("Contact Added Successfully.");
                    } else {
                        System.out.println("Contact List is Full.");
                    }
                    break;

                case 2:
                    System.out.println("\n===== Contact List =====");

                    if (count == 0) {
                        System.out.println("No Contacts Available.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " +
                                    names[i] + " - " + phones[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Contact Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(search)) {
                            System.out.println("Name : " + names[i]);
                            System.out.println("Phone: " + phones[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact Not Found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Contact Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}