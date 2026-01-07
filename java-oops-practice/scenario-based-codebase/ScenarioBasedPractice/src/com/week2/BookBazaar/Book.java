package com.week2.BookBazaar;

// Abstract Book class
public abstract class Book implements IDiscountable {
    private String title;
    private String author;
    private double price;
    private int stock;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        } 
        else {
            System.out.println("Not enough stock for " + title);
            return false;
        }
    }

    @Override
    public abstract void applyDiscount();
}
