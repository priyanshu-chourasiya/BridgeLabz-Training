package com.polymorphism.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {

        LibraryItem item1 = new Book(1, "Java", "James");
        LibraryItem item2 = new Magazine(2, "Tech Today", "Editor");
        LibraryItem item3 = new DVD(3, "Inception", "Nolan");

        item1.getItemDetails();
        System.out.println("Loan Days: " + item1.getLoanDuration());

        item2.getItemDetails();
        System.out.println("Loan Days: " + item2.getLoanDuration());

        item3.getItemDetails();
        System.out.println("Loan Days: " + item3.getLoanDuration());
    }
}
