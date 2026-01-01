package com.week1.CustomerBank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings s1 = new Savings(7000);
		CurrentAccount ca1 = new CurrentAccount(500);
		s1.deposite(500);
		s1.withdraw(200);
		s1.displayBalance();
		ca1.deposite(800);
		ca1.withdraw(65);
		ca1.displayBalance();
	}

}
