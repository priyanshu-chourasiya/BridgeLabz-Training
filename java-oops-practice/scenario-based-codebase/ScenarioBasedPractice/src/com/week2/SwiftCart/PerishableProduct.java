package com.week2.SwiftCart;



public class PerishableProduct extends Product {
    private String expirationDate;

    public PerishableProduct(String name, double price, String category, String expirationDate) {
        super(name, price, category);
        this.expirationDate = expirationDate;
    }

    @Override
    public double applyDiscount() {
        return price * 0.9; 
    }
}
