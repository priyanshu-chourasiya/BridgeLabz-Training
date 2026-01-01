package com.polymorphism.LibraryManagementSystem;

abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    abstract int getLoanDuration();

    void getItemDetails() {
        System.out.println(itemId + " " + title + " " + author);
    }
}
