package com.objectmodeling;

import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    List<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        System.out.println(name + " placed an order");
    }
}

public class CustomerProdOrder {
    public static void main(String[] args) {
        Customer c = new Customer("Ankit");
        Product p = new Product("Laptop", 60000);

        Order o = new Order();
        o.addProduct(p);
        c.placeOrder(o);
    }
}

