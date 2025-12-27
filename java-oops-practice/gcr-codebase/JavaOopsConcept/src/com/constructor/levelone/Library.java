package com.constructor.levelone;

class Library {
    String title;
    String author;
    double price;
    boolean available;

    Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }

    public static void main(String[] args) {
    	Library b = new Library("OOPs Java", "Herbert Schildt", 599);
        b.borrowBook();
        b.borrowBook();
    }
}

