package com.week2.EventEase;

public class Main {
    public static void main(String[] args) {

        User organizer = new User("Priyanshu", "priyanshu@.com", "023");

      
        BirthdayEvent bEvent = new BirthdayEvent(
                "Birthday", "Hall", "2026-02-14", 50,
                "Akhil", "ABC"
        );

        
        ConferenceEvent cEvent = new ConferenceEvent(
                "Tech", "Auditorium", "2026-03-10", 200,
                "Dr. Mehta", "JAVA"
        );

        bEvent.schedule();
        System.out.println("Total Cost: " + bEvent.calculateTotalCost());
        bEvent.reschedule("2026-01-30");

        System.out.println();

        cEvent.schedule();
        System.out.println("Total Cost: " + cEvent.calculateTotalCost());
        cEvent.cancel();
    }
}
