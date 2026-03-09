package com.bookmystay.service;

import java.util.*;

/**
 * Use Case 5:
 * This class manages add-on services associated with reservations.
 * Each reservation can have multiple optional services.
 */

public class ServiceManager {

    private Map<String, List<Service>> reservationServices;

    public ServiceManager() {
        reservationServices = new HashMap<>();
    }

    public void addService(String reservationId, Service service) {

        reservationServices
                .computeIfAbsent(reservationId, k -> new ArrayList<>())
                .add(service);

        System.out.println(service.getName() + " added to reservation " + reservationId);
    }

    public double calculateServiceCost(String reservationId) {

        List<Service> services = reservationServices.get(reservationId);

        if (services == null) return 0;

        double total = 0;

        for (Service s : services) {
            total += s.getPrice();
        }

        return total;
    }
}
