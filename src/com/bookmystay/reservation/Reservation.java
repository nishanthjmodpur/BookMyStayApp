package com.bookmystay.reservation;

import java.util.UUID;

/*
 * Use Case 4 : Booking Confirmation and Room Allocation
 * This class represents a reservation. Once a booking request is processed
 * successfully a Reservation object is created.
 */

public class Reservation {

    private String reservationId;
    private String guestName;
    private String roomType;
    private String roomId;
    private int nights;
    private double totalPrice;

    public Reservation(String guestName, String roomType, String roomId, int nights, double totalPrice) {
        this.reservationId = UUID.randomUUID().toString();
        this.guestName = guestName;
        this.roomType = roomType;
        this.roomId = roomId;
        this.nights = nights;
        this.totalPrice = totalPrice;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}