package com.week3.AddressBookSystem;
public class Main {
    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        Address a1 = new Address("Bhopal", "MP", "462001");
        Address a2 = new Address("Indore", "MP", "452001");

        Contact c1 = new Contact("Priyanshu", "Chourasiya",
                "9999999999", "p@gmail.com", a1);
        Contact c2 = new Contact("Amit", "Verma",
                "8888888888", "a@gmail.com", a2);

        book.addContact(c1);
        book.addContact(c2);

        book.editContact("Amit", "7777777777", "amit@gmail.com");

        System.out.println("\nSearch by city/state:");
        book.searchByCityOrState("MP");

        System.out.println("\nAll contacts (sorted):");
        book.displaySorted();

        book.deleteContact("Priyanshu");
    }
}
