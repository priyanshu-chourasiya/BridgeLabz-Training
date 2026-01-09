package com.week2.FoodLoop;

import java.util.ArrayList;

public class Order implements IOrderable {

    private ArrayList<FoodItem> items = new ArrayList<>();
    private int total;

   
    public Order(FoodItem f1, FoodItem f2) {
        items.add(f1);
        items.add(f2);
    }

    
    public Order() {}

    public void addItem(FoodItem item) {
        if (item.isAvailable() && item.reduceStock()) {
            items.add(item);
        } else {
            System.out.println(item.getName() + " is not available.");
        }
    }

    public int getTotal() {
        total = 0;
        for (FoodItem it : items) {
            total += it.getPrice();
        }
        return applyDiscount(total);
    }


    public int applyDiscount(int amount) {
        if (amount >= 500) {
            return amount - 100; 
        } else if (amount >= 300) {
            return amount - 50;  
        }
        return amount; // no discount
    }

    @Override
    public void placeOrder() {
        System.out.println("Order placed with " + items.size() + " items.");
    }

    @Override
    public void cancelOrder() {
        items.clear();
        System.out.println("Order cancelled.");
    }
}
