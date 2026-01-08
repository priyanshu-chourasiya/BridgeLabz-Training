package com.week2.MediStore;

import java.time.LocalDate;

public class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        // liquid meds expire faster → strict check
        LocalDate today = LocalDate.now();
        return today.isAfter(getExpiryDate());
    }
}

