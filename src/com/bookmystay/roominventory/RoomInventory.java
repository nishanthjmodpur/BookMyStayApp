package com.bookmystay.roominventory;

import java.util.HashMap;
import java.util.HashSet;

/*
 * Use Case 1: RoomInventory class
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
		if (this.roomCount.get(roomType) != null) {
			this.roomCount.put(roomType, count);
		}
	}
	
	private void addRoomPrice(String roomType, double price) {
		if (this.roomPrice.get(roomType) != null) {
			this.roomPrice.put(roomType, price);
		}
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
	
}
