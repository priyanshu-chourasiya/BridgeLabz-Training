package com.week2.MediStore;

import java.time.LocalDate;

public class Medicine implements ISellable {
    private String name;
    private double price;
    private LocalDate expiryDate;
    private int quantity;

    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10);
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public LocalDate getExpiryDate() { return expiryDate; }

    private double applyDiscount(double percent) {
        return price - (price * percent / 100);
    }

    @Override
    public void sell(int qty) {
        if (qty <= 0) return;

        if (qty > quantity) {
            System.out.println("Not enough stock!");
            return;
        }

        quantity -= qty;
        System.out.println(qty + " units sold of " + name);
    }

    @Override
    public boolean checkExpiry() {
        return LocalDate.now().isAfter(expiryDate);
    }

    public void addStock(int qty) {
        if (qty > 0) quantity += qty;
    }

    public double calculateTotalPrice(int qty) {
        return qty * price;
    }
}
