package com.week2.TourMate;

import java.util.ArrayList;

public class Trip {
    private String destination;
    private int budget;
    private int duration;

    Transport transport;
    Hotel hotel;
    ArrayList<Activity> activities = new ArrayList<>();

    public Trip(String destination, int budget, int duration) {
        this.destination = destination;
        this.budget = budget;
        this.duration = duration;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public int totalcost() {
        int total = 0;

        for (Activity act : activities) {
            total += act.totalcost();
        }

        return total;
    }

    public void showTripDetails() {
        System.out.println("Destination: " + destination);
        System.out.println("Budget: " + budget);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Total Cost: " + totalcost());
    }
}
