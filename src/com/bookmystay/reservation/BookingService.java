package com.bookmystay.reservation;

import java.util.*;

import com.bookmystay.roominventory.RoomInventory;

/*
 * Use Case 4:
 * This class handles reservation confirmation and room allocation
 * 
 * Data Structures used:
 * 	HashSet<String>: ensures unique room IDs
 * 	HashMap<String, Set<String>>: maps room types to assigned IDs
 */

public class BookingService {

    private RoomInventory inventory;

    private Set<String> bookedRoomIds;
    private Map<String, Set<String>> roomTypeToRooms;

    public BookingService(RoomInventory inventory) {
        this.inventory = inventory;
        bookedRoomIds = new HashSet<>();
        roomTypeToRooms = new HashMap<>();
    }

    public Reservation processRequest(ReservationRequest request) {

        String roomType = request.getRoomType();

        int available = inventory.getRoomCount(roomType);

        if (available <= 0) {
            System.out.println("No rooms available for " + roomType);
            return null;
        }

        String roomId = roomType + "-" + (available);

        if (bookedRoomIds.contains(roomId)) {
            System.out.println("Room already booked.");
            return null;
        }

        bookedRoomIds.add(roomId);

        roomTypeToRooms
                .computeIfAbsent(roomType, k -> new HashSet<>())
                .add(roomId);

        inventory.updateRoomCount(roomType, available - 1);

        double price = inventory.getRoomPrice(roomType);
        double total = price * request.getNights();

        Reservation reservation = new Reservation(
                request.getGuestName(),
                roomType,
                roomId,
                request.getNights(),
                total
        );

        System.out.println("Reservation confirmed for " + request.getGuestName());

        return reservation;
    }
}