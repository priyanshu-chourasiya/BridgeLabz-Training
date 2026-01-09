/*
 * "FoodLoop – Restaurant Ordering System"
Story: FoodLoop is an app where users place food orders from local restaurants.
Requirements:
● FoodItem class: name, category, price, availability.
● Order class: contains list of food items and total.
● Interface IOrderable with placeOrder() and cancelOrder().
● Use constructors to create custom combo meals.
● Operators: total price = sum of item prices – discounts.
● Encapsulation: keep item stock levels hidden.
● Inheritance: VegItem, NonVegItem extend FoodItem.
● Polymorphism: applyDiscount() varies by order total.
 */
package com.week2.FoodLoop;

public class Main {

    public static void main(String[] args) {

        // Create items
        FoodItem burger = new NonVegItem("Chicken Burger", 150, 5);
        FoodItem fries = new VegItem("French Fries", 80, 10);
        FoodItem pizza = new VegItem("Veg Pizza", 250, 8);

        // Custom Combo Meal using constructor
        Order comboOrder = new Order(burger, fries);
        comboOrder.placeOrder();
        System.out.println("Combo Total = " + comboOrder.getTotal());

        System.out.println("------------------------");

        // Normal Order
        Order order = new Order();
        order.addItem(burger);
        order.addItem(pizza);
        order.addItem(fries);

        order.placeOrder();

        System.out.println("Final Bill After Discount = " + order.getTotal());
    }
}
