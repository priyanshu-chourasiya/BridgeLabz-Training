/*
 *  "SwiftCart – The Grocery Shopping App"
Story: You're building SwiftCart, an online grocery platform where users add items to cart and
check out. The backend logic for cart management is your task.
Requirements:
● Product class: name, price, category.
● Cart class: holds a list of products and totalPrice.
● Constructors allow cart creation with or without pre-selected items.
● ICheckout interface with generateBill() and applyDiscount().
● Use encapsulation to protect price calculations.
● Operators for total: price * quantity, discount: totalPrice - coupon.
● Inheritance: different product types like PerishableProduct,
NonPerishableProduct.
● Use polymorphism in discount application (e.g., discount varies by product type).
● Apply access modifiers so only Cart can update prices.
 */
package com.week2.SwiftCart;


public class Main {
    public static void main(String[] args) {

        // Create products
        Product milk = new PerishableProduct("Milk", 3.5, "Dairy", "2026-01-10");
        Product bread = new PerishableProduct("Bread", 2.0, "Bakery", "2026-01-08");
        Product rice = new NonPerishableProduct("Rice", 10.0, "Grains", "IndiaBrand");
        Product pasta = new NonPerishableProduct("Pasta", 5.0, "Grains", "ItalyBrand");

        //  empty cart
        Cart cart = new Cart();

        // Add products
        cart.addProduct(milk);
        cart.addProduct(bread);
        cart.addProduct(rice);
        cart.addProduct(pasta);

        //  discount
        cart.applyDiscount();

        //  bill
        cart.generateBill();

        // Remove 
        cart.removeProduct(bread);
        cart.applyDiscount();
        cart.generateBill();
    }
}

