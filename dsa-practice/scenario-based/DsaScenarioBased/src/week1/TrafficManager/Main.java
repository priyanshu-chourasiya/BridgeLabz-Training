/*
 *  TrafficManager – Roundabout Vehicle Flow (Circular Linked List +
Queue)
Story: A smart city roundabout allows vehicles to enter and exit dynamically. Each vehicle is a
node in a Circular Linked List. A Queue manages vehicles waiting to enter.
Requirements:
● Add or remove cars in a circular path.
● Queue overflow/underflow handling.
● Print state of roundabout at any time.
 */

package week1.TrafficManager;

import java.util.*;

public class Main {
    LinkedList<String> roundabout = new LinkedList<>();
    Queue<String> waitingQueue = new LinkedList<>();
    int maxQueueSize = 5;

    void addCarToQueue(String car) {
        if (waitingQueue.size() < maxQueueSize) {
            waitingQueue.add(car);
        } else {
            System.out.println("Queue full: " + car + " cannot wait");
        }
    }

    void moveQueueToRoundabout() {
        if (!waitingQueue.isEmpty()) {
            roundabout.add(waitingQueue.poll());
        } else {
            System.out.println("Queue empty");
        }
    }

    void removeCarFromRoundabout(String car) {
        if (roundabout.contains(car)) {
            roundabout.remove(car);
        } else {
            System.out.println(car + " not found");
        }
    }

    void rotateRoundabout() {
        if (!roundabout.isEmpty()) {
            String car = roundabout.removeFirst();
            roundabout.addLast(car);
        }
    }

    void printRoundabout() {
        System.out.println("Roundabout: " + roundabout);
    }

    void printQueue() {
        System.out.println("Waiting Queue: " + waitingQueue);
    }

    public static void main(String[] args) {
        Main tm = new Main();

        tm.addCarToQueue("Car1");
        tm.addCarToQueue("Car2");
        tm.addCarToQueue("Car3");
        tm.printQueue();

        tm.moveQueueToRoundabout();
        tm.moveQueueToRoundabout();
        tm.printRoundabout();

        tm.rotateRoundabout();
        tm.printRoundabout();

        tm.removeCarFromRoundabout("Car1");
        tm.printRoundabout();
    }
}
