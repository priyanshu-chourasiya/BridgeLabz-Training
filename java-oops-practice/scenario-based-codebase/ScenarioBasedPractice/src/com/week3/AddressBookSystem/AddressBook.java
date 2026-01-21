package com.week3.AddressBookSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AddressBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add Contact (check duplicate by first name)
    public void addContact(Contact c) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(c.getFirstName())) {
                System.out.println("Duplicate contact not allowed.");
                return;
            }
        }
        contacts.add(c);
        System.out.println("Contact added.");
    }

    // Edit Contact
    public void editContact(String name, String newPhone, String newEmail) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(name)) {
                c.setPhone(newPhone);
                c.setEmail(newEmail);
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete Contact
    public void deleteContact(String name) {
        contacts.removeIf(c -> c.getFirstName().equalsIgnoreCase(name));
        System.out.println("Contact deleted (if existed).");
    }

    // Search by City or State
    public void searchByCityOrState(String value) {
        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(value) ||
                c.getAddress().getState().equalsIgnoreCase(value)) {
                System.out.println(c);
            }
        }
    }

    // Display Sorted Contacts
    public void displaySorted() {
        Collections.sort(contacts, Comparator.comparing(Contact::getFirstName));
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}

