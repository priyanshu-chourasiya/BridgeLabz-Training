package com.week2.BookBazaar;

import java.util.ArrayList;
import java.util.List;

// Simple Order class
public class Order {
    private List<Book> books = new ArrayList<>();
    private int quantity = 0;
    private String status = "Pending";

    
    public void addBook(Book book) {
        if (book.getStock() > 0) {
            books.add(book);
            book.reduceStock(1);
            quantity++;
        } else {
            System.out.println("Book out of stock: " + book.getTitle());
        }
    }

    // Calculate total cost
    public double calculateTotal() {
        double total = 0;
        for (Book book : books) {
            total += book.getPrice();
        }
        return total;
    }

    public String getStatus() {
        return status;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus; 
    }
}
