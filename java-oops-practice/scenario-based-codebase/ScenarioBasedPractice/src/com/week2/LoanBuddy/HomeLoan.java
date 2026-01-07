package com.week2.LoanBuddy;

public class HomeLoan extends BaseLoan {

    public HomeLoan(Applicant applicant, LoanApplication loanApplication) {
        super(applicant, loanApplication);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
       
        return applicant.getCreditScore() >= 750 && applicant.getIncome() >= 30000;
    }
}
