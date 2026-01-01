package com.polymorphism.LibraryManagementSystem;

class Book extends LibraryItem implements Reservable {

    Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        System.out.println("Book reserved");
    }

    public boolean checkAvailability() {
        return true;
    }
}
