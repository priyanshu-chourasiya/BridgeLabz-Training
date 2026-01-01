package com.polymorphism.BankingSystem;

public class SavingsAccount extends BankAccount implements Loanable {

    SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04;   // 4% interest
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied for Savings Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 2;
    }
}
