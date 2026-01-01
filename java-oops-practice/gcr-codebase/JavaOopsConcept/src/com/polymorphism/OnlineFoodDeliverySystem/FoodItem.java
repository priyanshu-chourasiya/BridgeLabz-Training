package com.polymorphism.OnlineFoodDeliverySystem;

abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    abstract double calculateTotalPrice();

    void getItemDetails() {
        System.out.println(itemName + " | Qty: " + quantity + " | Price: " + price);
    }
}
