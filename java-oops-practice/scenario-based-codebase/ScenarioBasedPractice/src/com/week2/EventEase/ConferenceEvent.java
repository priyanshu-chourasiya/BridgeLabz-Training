package com.week2.EventEase;

public class ConferenceEvent extends Event {

    private String speaker;
    private String topic;

    public ConferenceEvent(String eventName, String location, String date, int attendees, String speaker, String topic) {
        super(eventName, location, date, attendees);
        this.speaker = speaker;
        this.topic = topic;
        this.serviceCost = 5000000; 
    }

    @Override
    public void schedule() {
        System.out.println("Conference on '" + topic + "' by " + speaker + " scheduled on " + date);
    }
}

