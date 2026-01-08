package com.week2.TourMate;

public class Activity implements IBookable {
    private String name;
    private int costPerHour;
    private int hours;

    public Activity(String name, int costPerHour, int hours) {
        this.name = name;
        this.costPerHour = costPerHour;
        this.hours = hours;
    }

    public int totalcost() {
        return costPerHour * hours;
    }

    @Override
    public void book() {
        System.out.println("Activity booked: " + name + " Cost: " + totalcost());
    }

    @Override
    public void cancel() {
        System.out.println("Activity cancelled: " + name);
    }
}
