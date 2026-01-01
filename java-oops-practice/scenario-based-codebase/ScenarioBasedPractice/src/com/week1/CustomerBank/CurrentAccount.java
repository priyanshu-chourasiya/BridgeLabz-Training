package com.week1.CustomerBank;

public class CurrentAccount {
	
	int bankbalance;
	
	CurrentAccount(int bankbalance){
		this.bankbalance = bankbalance;
		System.out.println("Welcome to CurrentAccount ");
	}
	
	void deposite(int amount) {
		if (amount > 0) {
		    bankbalance += amount;
		} 
		else {
		    System.out.println("Amount should be greater than 0");
		}

	}
	
	void withdraw(int amount) {
		if (amount <= 0) {
		    System.out.println("Invalid amount");
		} else if (amount > bankbalance) {
		    System.out.println("Insufficient balance");
		} else {
		    bankbalance -= amount;
		}

	}
	
	void displayBalance() {
        System.out.println("Current Balance: " + bankbalance);
    }
	
	
}
