package com.week2.SwiftCart;


import java.util.*;

public class Cart implements ICheckout {
    private List<Product> products;
    private double totalPrice;

 
    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

   
    public Cart(List<Product> preSelectedProducts) {
        products = new ArrayList<>(preSelectedProducts);
        calculateTotal();
    }

    public void addProduct(Product p) {
        products.add(p);
        calculateTotal();
        System.out.println(p.getName() + " added to cart.");
    }

    public void removeProduct(Product p) {
        products.remove(p);
        calculateTotal();
        System.out.println(p.getName() + " removed from cart.");
    }

    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    @Override
    public void applyDiscount() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.applyDiscount();
        }
    }

    @Override
    public void generateBill() {
        
        for (Product p : products) {
            System.out.println(p.getName() + " : " + String.format("%.2f", p.applyDiscount()));
        }
        System.out.println("Total Price after discount: " + String.format("%.2f", totalPrice));
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

