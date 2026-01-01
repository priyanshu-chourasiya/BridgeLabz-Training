package com.polymorphism.OnlineFoodDeliverySystem;

class NonVegItem extends FoodItem {

    NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    double calculateTotalPrice() {
        double extraCharge = 50;
        return (getPrice() * getQuantity()) + extraCharge;
    }
}
