package com.week1.MyBank;

public class CurrentAccount extends Account {

    int interestRate = 5;

    public CurrentAccount(int accountNumber) {
        super(accountNumber);
    }

    void calculateInterest() {
        System.out.println("Current Account Interest Rate: " + interestRate + "%");
    }
}
