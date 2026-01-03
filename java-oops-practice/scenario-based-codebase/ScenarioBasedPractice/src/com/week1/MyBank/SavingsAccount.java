package com.week1.MyBank;

public class SavingsAccount extends Account {

    int interestRate = 10;

    public SavingsAccount(int accountNumber) {
        super(accountNumber);
    }

    void calculateInterest() {
        System.out.println("Savings Account Interest Rate: " + interestRate + "%");
    }
}
