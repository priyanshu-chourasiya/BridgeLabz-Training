package com.week1.ShopingCart;

public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("Laptop", 50000));
        cart.addProduct(new Product("Mouse", 500));
        cart.addProduct(new Product("Keyboard", 1500));

        System.out.println("Total Price: " + cart.calculateTotal());
    }
}
