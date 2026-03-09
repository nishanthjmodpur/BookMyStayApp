package com.bookmystay.main;

import java.util.Scanner;

import com.bookmystay.roominventory.RoomInventory;

/*
 * Main Class 
 * 
 * Entry point for Use Case 1
 * 
 * A room inventory object is created and room related data is inserted into hashmap.
 * 
 * @author Developer
 * @version 1.0
 */

public class BookMyStay {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		RoomInventory roomInventory = new RoomInventory();
		roomInventory.addRoom("single", 10, 200.00);
		roomInventory.addRoom("double", 10, 400.00);
		roomInventory.addRoom("suite", 5, 1500.00);
		
		scanner.close();
		
	}
}
