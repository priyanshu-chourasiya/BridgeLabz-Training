package com.constructor.levelone;

class Books {
    String title;
    String author;
    double price;

    // Default Constructor
    Books() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " | " + author + " | ₹" + price);
    }

    public static void main(String[] args) {
        Books b1 = new Books();
        Books b2 = new Books("Java Basics", "James Gosling", 499);

        b1.display();
        b2.display();
    }
}

