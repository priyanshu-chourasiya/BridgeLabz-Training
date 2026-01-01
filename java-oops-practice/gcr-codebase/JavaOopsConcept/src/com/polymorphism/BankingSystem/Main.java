package com.polymorphism.BankingSystem;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount(101, "Rohit", 50000));
        accounts.add(new CurrentAccount(201, "Ankit", 80000));

        for (BankAccount acc : accounts) {

            acc.displayDetails();

            acc.deposit(5000);
            acc.withdraw(2000);

            double interest = acc.calculateInterest();
            System.out.println("Interest: " + interest);

            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                loan.applyForLoan();
                System.out.println("Loan Eligibility: " + loan.calculateLoanEligibility());
            }

            System.out.println("----------------------------");
        }
    }
}
