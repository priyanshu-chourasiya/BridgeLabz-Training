package com.week2.EventEase;

public class BirthdayEvent extends Event {

    private String birthdayPersonName;
    private String theme;

    public BirthdayEvent(String eventName, String location, String date, int attendees, String birthdayPersonName, String theme) {
        super(eventName, location, date, attendees);
        this.birthdayPersonName = birthdayPersonName;
        this.theme = theme;
        this.serviceCost = 1500000; 
    }

    @Override
    public void schedule() {
        System.out.println("Birthday party for " + birthdayPersonName + " scheduled with theme '" + theme + "' on " + date);
    }
}
