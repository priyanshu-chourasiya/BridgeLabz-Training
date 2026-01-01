package com.polymorphism.OnlineFoodDeliverySystem;

public class Main {

    static void processOrder(FoodItem item) {
        item.getItemDetails();
        System.out.println("Total Price: " + item.calculateTotalPrice());
        System.out.println();
    }

    public static void main(String[] args) {

        FoodItem f1 = new VegItem("Paneer Roll", 120, 2);
        FoodItem f2 = new NonVegItem("Chicken Burger", 180, 1);

        processOrder(f1);
        processOrder(f2);
    }
}
