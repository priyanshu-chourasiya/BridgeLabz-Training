/*
 *  "BookBazaar – Digital Bookstore System"
Story: You’re building the backend for BookBazaar, an online bookstore. It must handle book
inventory, orders, and discounts.
Requirements:
● Book class with fields: title, author, price, stock.
● Order class that links a user to one or more books.
● Interface IDiscountable with method applyDiscount().
● Use constructors to create books with optional offers.
● Use operators to compute total cost: price × quantity – discount.
● Encapsulation: inventory count should only be updated through methods.
● Inheritance: EBook, PrintedBook extend Book.
● Polymorphism: applyDiscount() works differently for each book type.
● Access modifiers used to restrict order status updates.

 */

package com.week2.BookBazaar;

public class Main {
    public static void main(String[] args) {
        
        EBook ebook1 = new EBook("Digital Fortress", "Dan Brown", 300, 5);
        PrintedBook pbook1 = new PrintedBook("The Alchemist", "Paulo Coelho", 500, 3);

        
        ebook1.applyDiscount();      
        pbook1.applyDiscount();      

        
        Order order = new Order();

        // Add books to order
        order.addBook(ebook1);
        order.addBook(pbook1);
        order.addBook(pbook1); 

        // Display total cost
        System.out.println("Total Order Cost: " + order.calculateTotal());

        // Update and display order status
        order.updateStatus("Shipped");
        System.out.println("Order Status: " + order.getStatus());
    }
}

