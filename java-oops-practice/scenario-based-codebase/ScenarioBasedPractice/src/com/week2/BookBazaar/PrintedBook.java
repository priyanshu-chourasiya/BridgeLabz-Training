package com.week2.BookBazaar;

// PrintedBook class
public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public void applyDiscount() {
        double discountedPrice = getPrice() - 50;
        if (discountedPrice < 0) discountedPrice = 0;
        setPrice(discountedPrice);
        System.out.println("Discount applied on PrintedBook " + getTitle() + " : New Price = " + getPrice());
    }
}
