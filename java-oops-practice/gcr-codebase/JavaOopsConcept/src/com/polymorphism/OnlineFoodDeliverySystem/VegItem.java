package com.polymorphism.OnlineFoodDeliverySystem;

class VegItem extends FoodItem implements Discountable {

    VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    double calculateTotalPrice() {
        return getPrice() * getQuantity() - applyDiscount();
    }

    public double applyDiscount() {
        return 20;
    }

    public String getDiscountDetails() {
        return "Flat ₹20 discount on Veg Item";
    }
}
