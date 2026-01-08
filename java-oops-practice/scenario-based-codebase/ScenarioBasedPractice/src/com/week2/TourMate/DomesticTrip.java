package com.week2.TourMate;

public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int budget, int duration) {
        super(destination, budget, duration);
    }

    public void book() {
        System.out.println("Domestic Trip booked");
    }

    public void cancel() {
        System.out.println("Domestic Trip cancelled.");
    }
}
