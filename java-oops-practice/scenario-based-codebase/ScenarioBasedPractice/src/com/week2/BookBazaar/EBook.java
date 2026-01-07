package com.week2.BookBazaar;

// EBook class
public class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public void applyDiscount() {
        double discountedPrice = getPrice() * 0.1;
        setPrice(discountedPrice);
        System.out.println("Discount applied on EBook '" + getTitle() + "': New Price = " + getPrice());
    }
}
