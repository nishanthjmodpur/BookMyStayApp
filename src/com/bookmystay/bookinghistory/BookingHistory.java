package com.bookmystay.bookinghistory;

import java.util.ArrayList;
import java.util.List;

import com.bookmystay.reservation.Reservation;

/*
 * Use Case 6:
 * This class is responsible for storing all confirmed reservations in the system.
 */

public class BookingHistory {

    private List<Reservation> reservations;

    public BookingHistory() {
        reservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void showAllReservations() {
        for (Reservation r : reservations) {
            System.out.println(
                    r.getReservationId() + " \t" +
                    r.getGuestName() + " \t" +
                    r.getRoomType() + " \t" +
                    r.getRoomId() + " \t" +
                    r.getTotalPrice()
            );
        }
    }
}