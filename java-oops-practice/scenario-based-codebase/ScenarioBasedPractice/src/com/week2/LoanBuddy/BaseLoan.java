package com.week2.LoanBuddy;

public abstract class BaseLoan implements IApprovable {

    private Applicant applicant;
    private LoanApplication loanApplication;

    public BaseLoan(Applicant applicant, LoanApplication loanApplication) {
        this.applicant = applicant;
        this.loanApplication = loanApplication;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public LoanApplication getLoanApplication() {
        return loanApplication;
    }

    @Override
    public double calculateEMI() {
        double P = applicant.getLoanAmount();
        double annualRate = loanApplication.getInterstrate();
        double R = annualRate / (12 * 100);
        int N = loanApplication.getTerm();  

        double numerator = P * R * Math.pow(1 + R, N);
        double denominator = Math.pow(1 + R, N) - 1;

        return numerator / denominator;
    }

    
    @Override
    public abstract boolean approveLoan(Applicant applicant);

}
