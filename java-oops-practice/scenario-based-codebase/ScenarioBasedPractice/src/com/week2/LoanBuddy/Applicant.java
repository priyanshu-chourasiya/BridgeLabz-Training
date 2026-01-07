package com.week2.LoanBuddy;

public class Applicant {
	private String name;
	private int creditScore;
	private int income;
	private int loanAmount;
	public Applicant(String name, int creditScore, int income, int loanAmount) {
		//super();
		this.name = name;
		this.creditScore = creditScore;
		this.income = income;
		this.loanAmount = loanAmount;
	}
	public String getName() {
		return name;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public int getIncome() {
		return income;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	
	
	
	
}
