package com.bookmystay.reservation;

/*
 * Use Case 3: Booking Reservation
 * 
 * This class represents a booking request made by a guest.
 * It contains basic details required to process a reservation.
 */

public class ReservationRequest {
	private String guestName;
	private String roomType;
	private int nights;
	
	public ReservationRequest(String guestName, String roomType, int nights) {
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	public String getGuestName() {
		return guestName;
	}
	
	public String roomType() {
		return roomType;
	}
	
	public int getNights() {
		return nights;
	}
}
