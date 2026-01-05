package com.week2.SwiftCart;


public class Product {
    protected String name;
    protected double price;
    protected String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

   
    public double applyDiscount() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

