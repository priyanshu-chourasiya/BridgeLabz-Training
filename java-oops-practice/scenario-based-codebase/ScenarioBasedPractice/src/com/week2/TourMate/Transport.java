package com.week2.TourMate;

public class Transport implements IBookable {
    private String type;
    private int costPerKm;
    private int distanceInKm;

    public Transport(String type, int costPerKm, int distanceInKm) {
        this.type = type;
        this.costPerKm = costPerKm;
        this.distanceInKm = distanceInKm;
    }

    public int totalcost() {
        return costPerKm * distanceInKm;
    }

    @Override
    public void book() {
        System.out.println("Transport booked: " + type + " Cost: " + totalcost());
    }

    @Override
    public void cancel() {
        System.out.println("Transport cancelled: " + type);
    }
}
