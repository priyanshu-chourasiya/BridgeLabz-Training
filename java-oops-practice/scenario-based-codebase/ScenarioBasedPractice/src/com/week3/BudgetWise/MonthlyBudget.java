package com.week3.BudgetWise;

import java.util.*;

public class MonthlyBudget extends Budget {
    public MonthlyBudget(double income, double limit, HashMap<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    public void generateReport() {
        System.out.println("Monthly Report");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + totalExpenses());
        System.out.println("Savings: " + netSavings());
    }

    public void detectOverspend() {
        for (String cat : categoryLimits.keySet()) {
            double spent = 0;
            for (Transaction t : transactions) {
                if (t.getCategory().equals(cat) && t.getType().equals("expense")) {
                    spent += t.getAmount();
                }
            }
            if (spent > categoryLimits.get(cat)) {
                System.out.println("Overspend in " + cat);
            }
        }
    }
}

