/*
 * "TourMate – Travel Itinerary Planner"
Story: TourMate helps travelers plan and book trips by organizing activities, transportation, and
stays.
Requirements :

● Trip class: destination, budget, duration.
● Transport, Hotel, Activity are associated.
● Interface IBookable with book() and cancel() methods.
● Encapsulation: hide cost breakdown inside services.
● Use constructors to generate complete trip packages.
● Operators: total budget = hotel + transport + activities.
● Inheritance: InternationalTrip, DomesticTrip extend Trip.
● Polymorphism: book() logic differs based on trip type.

 */

package com.week2.TourMate;

public class Main {
    public static void main(String[] args) {

        DomesticTrip trip = new DomesticTrip("Goa", 50000, 5);

        trip.setTransport(new Transport("Car", 20, 300)); 
        trip.setHotel(new Hotel("3-Star", 2000, 5)); 

        trip.addActivity(new Activity("Beach Walk", 0, 2));
        trip.addActivity(new Activity("Water Sports", 1500, 1));

        trip.showTripDetails();
        trip.book();
    }
}
