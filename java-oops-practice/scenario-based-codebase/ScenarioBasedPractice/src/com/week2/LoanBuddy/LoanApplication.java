package com.week2.LoanBuddy;

public class LoanApplication {
	private String loanType;
	private int term;
	private double interstRate;
	public LoanApplication(String loantype, int term, double interstrate) {
		//super();
		this.loanType = loantype;
		this.term = term;
		this.interstRate = interstrate;
	}
	public String getLoantype() {
		return loanType;
	}
	public int getTerm() {
		return term;
	}
	public double getInterstrate() {
		return interstRate;
	}
	
	
	
}
