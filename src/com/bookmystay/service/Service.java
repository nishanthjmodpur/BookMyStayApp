package com.bookmystay.service;

/**
 * Use Case 5: Add-On Service
 * This class represents an optional add-on service for a reservation.
 */

public class Service {

    private String name;
    private double price;

    public Service(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}