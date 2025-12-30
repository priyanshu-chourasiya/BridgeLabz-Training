package com.objectmodeling;

class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer c) {
        System.out.println("Account opened for " + c.name + " in " + name);
    }
}

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + " Balance: ₹" + balance);
    }
}

public class BankAndCustomer {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer c1 = new Customer("Rahul", 5000);

        bank.openAccount(c1);
        c1.viewBalance();
    }
}
