package com.week1.MyBank;

public class Account {
    int accountNumber;
    private int balance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
