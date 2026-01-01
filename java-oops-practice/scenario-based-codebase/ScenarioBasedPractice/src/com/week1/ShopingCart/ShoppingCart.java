package com.week1.ShopingCart;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    int calculateTotal() {
        int total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }
}
