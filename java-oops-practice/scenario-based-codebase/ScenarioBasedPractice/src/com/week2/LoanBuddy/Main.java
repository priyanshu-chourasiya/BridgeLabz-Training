/*
"LoanBuddy – Loan Approval Automation"
Story: A fintech startup named FinlyTech is launching a product called LoanBuddy, a web and
mobile app that automates personal loan approvals for salaried and self-employed applicants.
LoanBuddy should collect applicant data, verify eligibility, evaluate credit risk, and either
approve or reject the loan based on custom rules. It also calculates monthly EMIs and provides
a personalized repayments plan.
You’re hired as a Java backend developer to design and implement the core loan approval
engine.
Requirements:
● Applicant class: name, creditScore, income, loanAmount.
● LoanApplication class with loan type, term, and interest rate.
● Interface IApprovable with approveLoan() and calculateEMI().
● Use constructors to support different types of loans (personal, home, auto).
● Operators for EMI calculation: P × R × (1+R)^N / ((1+R)^N – 1)
● Encapsulation: keep credit score and internal approval logic private.
● Inheritance: different loan types (HomeLoan, AutoLoan) extending base class.
● Polymorphism: EMI calculation logic varies by loan type.
● Access modifiers to limit loan status changes to internal processes only.
 */
package com.week2.LoanBuddy;

public class Main {
    public static void main(String[] args) {

        Applicant applicant = new Applicant("Priyanshu", 720, 40000, 300000);

        LoanApplication loanApp = new LoanApplication("HomeLoan", 120, 8.5); 
    

        BaseLoan loan;

        if (loanApp.getLoantype().equalsIgnoreCase("HomeLoan")) {
            loan = new HomeLoan(applicant, loanApp);
        } 
        else if (loanApp.getLoantype().equalsIgnoreCase("AutoLoan")) {
            loan = new AutoLoan(applicant, loanApp);
        } 
        else {
            loan = new PersonalLoan(applicant, loanApp);
        }

        System.out.println("Applicant: " + applicant.getName());
        System.out.println("Loan Type: " + loanApp.getLoantype());
        System.out.println("Loan Amount: " + applicant.getLoanAmount());

        boolean status = loan.approveLoan(applicant);

        if (status) {
            System.out.println("Loan Approved!");
            System.out.println("Monthly EMI: " + loan.calculateEMI());
        } else {
            System.out.println("Loan Rejected!");
        }
    }
}

