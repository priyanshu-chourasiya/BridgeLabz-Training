package com.polymorphism.LibraryManagementSystem;

class DVD extends LibraryItem {

    DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 3;
    }
}
