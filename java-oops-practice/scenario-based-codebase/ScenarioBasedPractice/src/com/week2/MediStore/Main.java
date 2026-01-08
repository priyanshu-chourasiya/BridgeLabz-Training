/*
 * "MediStore – Pharmacy Inventory & Sales System"
Story: A pharmacy chain needs an app to manage drug inventory, sales, and expiry tracking.
Requirements:
● Medicine class: name, price, expiryDate, quantity.
● Interface ISellable with sell() and checkExpiry() methods.
● Constructors for medicines with default quantity.
● Use operators: total price, discount, stock adjustments.
● Encapsulation: internal stock and cost details are hidden.
● Inheritance: Tablet, Syrup, Injection extend Medicine.
● Polymorphism: checkExpiry() works differently for preserved vs liquid meds.
● Access Modifiers: make sensitive pricing logic private.
 */
package com.week2.MediStore;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Tablet t = new Tablet("Paracetamol", 20, LocalDate.of(2026, 5, 10), 50);
        Syrup s = new Syrup("Cough Syrup", 120, LocalDate.of(2025, 3, 1), 20);
        Injection inj = new Injection("Vitamin Injection", 200, LocalDate.of(2024, 12, 15), 15);

        // Selling
        t.sell(5);
        s.sell(2);

        // Expiry checks
        System.out.println("Tablet expired? " + t.checkExpiry());
        System.out.println("Syrup expired? " + s.checkExpiry());
        System.out.println("Injection expired? " + inj.checkExpiry());

        // Stock adjustments
        t.addStock(20);
        System.out.println("Updated stock for tablet: " + t.getQuantity());

        // Total price
        System.out.println("Total cost for 3 syrups: " + s.calculateTotalPrice(3));
    }
}
