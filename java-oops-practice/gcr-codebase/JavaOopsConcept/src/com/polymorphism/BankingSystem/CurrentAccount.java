package com.polymorphism.BankingSystem;

public class CurrentAccount extends BankAccount implements Loanable {

    CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.02;   // 2% interest
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied for Current Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 3;
    }
}
