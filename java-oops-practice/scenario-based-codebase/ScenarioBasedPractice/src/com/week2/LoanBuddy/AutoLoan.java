package com.week2.LoanBuddy;

public class AutoLoan extends BaseLoan {

    public AutoLoan(Applicant applicant, LoanApplication loanApplication) {
        super(applicant, loanApplication);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        // moderate credit score
        return applicant.getCreditScore() >= 650 && applicant.getIncome() >= 20000;
    }
}
