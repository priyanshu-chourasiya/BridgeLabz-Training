package com.week1.MyBank;

public class Main {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(101);
        sa.setBalance(10000);
        System.out.println("Savings Account No: " + sa.accountNumber);
        System.out.println("Balance: " + sa.getBalance());
        sa.calculateInterest();

        System.out.println("---------------");

        CurrentAccount ca = new CurrentAccount(201);
        ca.setBalance(20000);
        System.out.println("Current Account No: " + ca.accountNumber);
        System.out.println("Balance: " + ca.getBalance());
        ca.calculateInterest();
    }
}
