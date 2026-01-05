package com.week2.SwiftCart;


public class NonPerishableProduct extends Product {
    private String brand;

    public NonPerishableProduct(String name, double price, String category, String brand) {
        super(name, price, category);
        this.brand = brand;
    }

    @Override
    public double applyDiscount() {
        return price * 0.95; // 5% off
    }
}
