package com.bookmystay.roominventory;

import java.util.HashMap;
import java.util.HashSet;

/*
 * Use Case 2: RoomInventory class
 * 
 * This class stores room count, pricing related information for all room types.
 * 
 * roomSearch(): displays room types with count of available rooms and price per night of that type of room.
 * 
 */

public class RoomInventory {
	private HashSet<String> roomTypes;
	private HashMap<String, Integer> roomCount;
	private HashMap<String, Double> roomPrice;
	
	public RoomInventory() {
		this.roomTypes = new HashSet<String>();
		this.roomCount = new HashMap<String, Integer>();
		this.roomPrice = new HashMap<String, Double>();
	}
	
	public HashSet<String> getRoomTypes() {
		return roomTypes;
	}
	
	public int getRoomCount(String roomType) {
		return roomCount.get(roomType);
	}
	
	public double getRoomPrice(String roomType) {
		return roomPrice.get(roomType);
	}
	
	private void addRoomTypes(String roomType) {
		this.roomTypes.add(roomType);
	}
	
	private void addRoomCount(String roomType, int count) {
		this.roomCount.put(roomType, count);
	}
	
	private void addRoomPrice(String roomType, double price) {
		this.roomPrice.put(roomType, price);
	}
	
	public void addRoom(String roomType, int count, double price) {
		addRoomTypes(roomType);
		addRoomCount(roomType, count);
		addRoomPrice(roomType, price);
	}
	
	public void updateRoomPrice(String roomType, double newPrice) {
		if (this.roomPrice.containsKey(roomType)) {
			this.roomPrice.put(roomType, newPrice);
		}
	}
	
	public void updateRoomCount(String roomType, int count) {
		if (this.roomCount.containsKey(roomType)) {
			this.roomCount.put(roomType, count);
		}
	}
	
	/*
	 *  roomSearch(): displays room types with count of available rooms and price per night of that type of room.
	 */
	
	public void roomSearch() {
		System.out.println("Available rooms: ");
		for (String roomType : roomTypes) {
			System.out.println("Room Type: " + roomType + " \t" + "Available rooms: " + getRoomCount(roomType) + "\t" + "Price Per Night: " + getRoomPrice(roomType));
		}
	}
	
}
