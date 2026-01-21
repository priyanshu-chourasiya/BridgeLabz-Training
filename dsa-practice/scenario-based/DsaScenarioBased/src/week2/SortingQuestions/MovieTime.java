/*
 * . MovieTime – Theater Show Listings (Insertion Sort)
Story: A movie theater allows users to sort upcoming showtimes. Since shows are added
throughout the day and the existing list is almost sorted, the app uses Insertion Sort to insert
each new show in the correct time slot.
Concepts Involved:
● Insertion Sort
● Real-time insertion
● Time-based ordering
 */

package week2.SortingQuestions;

import java.util.ArrayList;

public class MovieTime {

    static class Show {
        String name;
        int time; // 24-hour format

        Show(String name, int time) {
            this.name = name;
            this.time = time;
        }
    }

    static ArrayList<Show> shows = new ArrayList<>();

    // Insertion sort during insertion
    static void addShow(String name, int time) {
        Show newShow = new Show(name, time);
        shows.add(newShow);

        int i = shows.size() - 1;
        while (i > 0 && shows.get(i - 1).time > newShow.time) {
            shows.set(i, shows.get(i - 1));
            i--;
        }
        shows.set(i, newShow);
    }

    static void display() {
        for (Show s : shows) {
            System.out.println(s.name + " - " + s.time);
        }
    }

    public static void main(String[] args) {

        addShow("Avatar", 1800);
        addShow("Inception", 1500);
        addShow("Jawan", 2000);
        addShow("Interstellar", 1700);

        System.out.println("Sorted Showtimes:");
        display();
    }
}

