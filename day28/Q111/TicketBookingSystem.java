package day28.Q111;
import java.util.Scanner;

public class TicketBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int availableSeats = 10;
        int choice;

        do {
            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Check Available Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Available Seats: " + availableSeats);
                    break;

                case 2:
                    System.out.print("Enter number of tickets to book: ");
                    int book = sc.nextInt();

                    if (book <= availableSeats && book > 0) {
                        availableSeats -= book;
                        System.out.println(book + " Ticket(s) Booked Successfully.");
                    } else {
                        System.out.println("Not enough seats available.");
                    }
                    break;

                case 3:
                    System.out.print("Enter number of tickets to cancel: ");
                    int cancel = sc.nextInt();

                    if (cancel > 0 && availableSeats + cancel <= 10) {
                        availableSeats += cancel;
                        System.out.println(cancel + " Ticket(s) Cancelled Successfully.");
                    } else {
                        System.out.println("Invalid cancellation.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Ticket Booking System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}