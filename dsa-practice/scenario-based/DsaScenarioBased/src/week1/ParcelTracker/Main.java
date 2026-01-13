/*
 *  ParcelTracker – Delivery Chain Management (Singly Linked List)
Story: A courier company tracks parcels through stages like Packed → Shipped → In Transit →
Delivered. Each stage is a node in a Singly Linked List.
Requirements:
● Forward tracking through stages.
● Add custom intermediate checkpoints.
● Handle lost/missing parcels (null pointers).
 */

package week1.ParcelTracker;

public class Main {

    static class Stage {
        String name;
        Stage next;
        Stage(String name) { this.name = name; }
    }

    public static void main(String[] args) {
        Stage packed = new Stage("Packed");
        Stage shipped = new Stage("Shipped");
        Stage transit = new Stage("In Transit");
        Stage delivered = new Stage("Delivered");

        packed.next = shipped;
        shipped.next = transit;
        transit.next = delivered;

        Stage head = packed;

        
        Stage customs = new Stage("Customs");
        transit.next = customs;
        customs.next = delivered;

       
        Stage temp = head;
        while(temp != null){
            System.out.println(temp.name);
            temp = temp.next;
        }

        
        Stage lost = null;
        if(lost == null) System.out.println("Parcel status unknown or lost!");
    }
}

