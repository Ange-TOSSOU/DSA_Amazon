package Programming_with_ArrayLists.controller;

import Programming_with_ArrayLists.model.Seat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeatBooking {

    private List<Seat> bookedSeatsList;

    public SeatBooking() {
        bookedSeatsList = new ArrayList<>();
    }

    public void addNewBooking(String seatNumber) {
        // Check if the seat is already booked.
        if (seatNumber == null) {
            return;
        }
        for (Seat bookedSeat : bookedSeatsList) {
            if (bookedSeat.getSeatNumber().equals(seatNumber) && bookedSeat.isBooked() && !bookedSeat.isCanceled()) {
                System.out.println("Seat " + seatNumber + " is already booked.");
                return;
            }
        }

        // Create the seat and book it.
        Seat seatToBook = new Seat(seatNumber);
        seatToBook.setBooked(true);
        seatToBook.setBookingDate(new Date());
        bookedSeatsList.add(seatToBook);

        System.out.println("Seat " + seatNumber + " has been successfully booked!");
    }

    public void cancelBooking(String seatNumber) {
        for (Seat bookedSeat : bookedSeatsList) {
            if (bookedSeat.getSeatNumber().equals(seatNumber)  && !bookedSeat.isCanceled()) {
                bookedSeat.setBooked(false);
                bookedSeat.setCanceled(true);
                System.out.println("Seat " + seatNumber + " has been successfully removed!");
                return;
            }
        }

        System.out.println("Seat " + seatNumber + " was not found.");
    }

    public void updateBooking(String oldSeatNumber, String newSeatNumber) {
        if (newSeatNumber == null) {
            return;
        }

        for (Seat bookedSeat : bookedSeatsList) {
            if (bookedSeat.getSeatNumber().equals(oldSeatNumber)  && !bookedSeat.isCanceled()) {
                bookedSeat.setSeatNumber(newSeatNumber);
                System.out.println("Seat " + oldSeatNumber + " has been updated to " + newSeatNumber + "!");
                return;
            }
        }

        System.out.println("Seat " + oldSeatNumber + " was not found.");
    }

    public void displayBookings() {
        if (bookedSeatsList.isEmpty()) {
            System.out.println("No bookings have been made yet.");
        } else {
            for (Seat bookedSeat : bookedSeatsList) {
                if (bookedSeat.isBooked() && !bookedSeat.isCanceled()) {
                    System.out.println("Seat " + bookedSeat.getSeatNumber() + " booked at " + bookedSeat.getBookingDate() + ".");
                }
            }
        }
    }
}
