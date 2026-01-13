package com.week3.BudgetWise;

import java.util.*;

public class AnnualBudget extends Budget {
    public AnnualBudget(double income, double limit, HashMap<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    public void generateReport() {
        System.out.println("Annual Report");
        System.out.println("Total Yearly Income: " + income);
        System.out.println("Total Yearly Expenses: " + totalExpenses());
        System.out.println("Net Annual Savings: " + netSavings());
    }

    public void detectOverspend() {
        if (totalExpenses() > limit) {
            System.out.println("Overspend detected on yearly budget");
        }
    }
}
