package com.bookmystay.reservation;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Use Case 3: Booking Reservation
 * 
 * Manages incoming booking requests using a FIFO queue.
 * 
 * Queue is used to ensure that booking requests are processed in the order
 * they arrive.
 */

public class BookingQueue {
	private Queue<ReservationRequest> bookingQueue;
	
	public BookingQueue() {
		bookingQueue = new LinkedList<ReservationRequest>();
	}
	
	public void addBookingRequest(ReservationRequest request) {
		bookingQueue.offer(request);
		System.out.println("Booking request added for " + request.getGuestName());
	}
	
	public ReservationRequest getNextRequest() {
		return bookingQueue.poll();
	}
	
	public boolean hasRequests() {
		return !bookingQueue.isEmpty();
	}
}
