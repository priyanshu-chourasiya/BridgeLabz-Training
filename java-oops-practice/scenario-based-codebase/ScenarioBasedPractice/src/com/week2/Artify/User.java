package com.week2.Artify;

public class User {

    private String name;
    private double walletBalance;

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public String getName() {
        return name;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void deductBalance(double amount) {
        if (walletBalance >= amount) {
            walletBalance -= amount;
        } else {
            System.out.println("Not enough money in wallet.");
        }
    }
}
