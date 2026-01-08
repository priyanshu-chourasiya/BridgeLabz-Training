package com.week2.TourMate;

public class Hotel implements IBookable {
    private String type;
    private int costPerDay;
    private int days;

    public Hotel(String type, int costPerDay, int days) {
        this.type = type;
        this.costPerDay = costPerDay;
        this.days = days;
    }

    public int totalcost() {
        return costPerDay * days;
    }

    @Override
    public void book() {
        System.out.println("Hotel booked: " + type + " Cost: " + totalcost());
    }

    @Override
    public void cancel() {
        System.out.println("Hotel cancelled: " + type);
    }
}
