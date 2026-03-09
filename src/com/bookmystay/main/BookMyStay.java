package com.bookmystay.main;

import java.util.Scanner;

import com.bookmystay.reservation.BookingQueue;
import com.bookmystay.reservation.BookingService;
import com.bookmystay.reservation.Reservation;
import com.bookmystay.reservation.ReservationRequest;
import com.bookmystay.roominventory.RoomInventory;

/*
 * Main Class 
 * 
 * Entry point for Use Case 4
 * 
 * A room inventory object is created and room related data is inserted into hashmap.
 * room search to check available rooms.
 * 
 * @author Developer
 * @version 4.0
 */

public class BookMyStay {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		RoomInventory roomInventory = new RoomInventory();
		roomInventory.addRoom("single", 10, 200.00);
		roomInventory.addRoom("double", 10, 400.00);
		roomInventory.addRoom("suite", 5, 1500.00);
		
		roomInventory.roomSearch();
		
		BookingQueue bookingQueue = new BookingQueue();
		BookingService bookingService = new BookingService(roomInventory);
		
		bookingQueue.addBookingRequest(new ReservationRequest("Nish", "single", 2));
		bookingQueue.addBookingRequest(new ReservationRequest("Nish", "suite", 1));
		
		while (bookingQueue.hasRequests()) {
			ReservationRequest request = bookingQueue.getNextRequest();
			Reservation reservation = bookingService.processRequest(request);
		}
		
		scanner.close();
		
	}
}
