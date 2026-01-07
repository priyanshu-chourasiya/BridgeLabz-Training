package com.week2.EventEase;

public class Event implements ISchedulable {

    private static int idCounter = 0;
    private final int eventId;       
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    // Encapsulation
    protected double venueCost;
    protected double serviceCost;
    protected double discount;

    public Event(String eventName, String location, String date, int attendees) {
        this.eventId = idCounter++;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = attendees * 200;  
        this.serviceCost = 0;              
    }

    
    public Event(String eventName, String location, String date, int attendees, double cateringCost, double decorCost) {
        this.eventId = idCounter++;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = attendees * 200;
        this.serviceCost = cateringCost + decorCost;
    }

    public int getEventId() {
        return eventId;
    }

    
    public double calculateTotalCost() {
        return (venueCost + serviceCost) - discount;
    }

    @Override
    public void schedule() {
        System.out.println("Event '" + eventName + "' scheduled on " + date + " at " + location);
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Event '" + eventName + "' rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Event '" + eventName + "' has been cancelled.");
    }
}

