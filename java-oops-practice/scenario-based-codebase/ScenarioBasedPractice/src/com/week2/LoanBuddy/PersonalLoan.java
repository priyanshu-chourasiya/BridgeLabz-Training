package com.week2.LoanBuddy;

public class PersonalLoan extends BaseLoan {

    public PersonalLoan(Applicant applicant, LoanApplication loanApplication) {
        super(applicant, loanApplication);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        // stricter income-to-loan ratio
        return applicant.getCreditScore() >= 700 &&
               applicant.getIncome() > applicant.getLoanAmount() / 2;
    }
}
