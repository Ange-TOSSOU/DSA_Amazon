package Programming_with_ArrayLists;

import Programming_with_ArrayLists.controller.SeatBooking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        SeatBooking bookingManager = new SeatBooking();

        while (true) {
            System.out.println("\n1. Add Booking" +
                    "\n2. Cancel Booking" +
                    "\n3. Update Booking" +
                    "\n4. Display Bookings" +
                    "\n5. Exit"
            );
            System.out.print("Choose an option : ");

            int choice = -1;
            try {
                choice = keyboard.nextInt();
                keyboard.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                keyboard.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the seat number you want to book : ");
                    bookingManager.addNewBooking(keyboard.next());
                    break;
                case 2:
                    System.out.print("Enter the seat number you want to cancel : ");
                    bookingManager.cancelBooking(keyboard.next());
                    System.out.println("All bookings after removal:");
                    bookingManager.displayBookings();
                    break;
                case 3:
                    System.out.print("Enter the seat number you want to update : ");
                    String oldSeatNumber = keyboard.next();
                    System.out.print("Enter the new seat number : ");
                    String newSeatNumber = keyboard.next();
                    bookingManager.updateBooking(oldSeatNumber, newSeatNumber);
                    System.out.println("All bookings after update:");
                    bookingManager.displayBookings();
                    break;
                case 4:
                    System.out.println("All bookings:");
                    bookingManager.displayBookings();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    keyboard.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

}
