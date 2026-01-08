package com.week2.TourMate;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int budget, int duration) {
        super(destination, budget, duration);
    }

    public void book() {
        System.out.println("International Trip booked");
    }

    public void cancel() {
        System.out.println("International Trip cancelled");
    }
}
