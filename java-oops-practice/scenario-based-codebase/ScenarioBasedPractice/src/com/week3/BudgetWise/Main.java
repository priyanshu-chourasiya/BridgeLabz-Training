/*
 * "BudgetWise – Personal Finance Tracker"
Story: BudgetWise helps users plan monthly budgets and track income/expenses across
categories.
Requirements:
● Transaction class: amount, type, date, category.
● Budget class: income, limit, categoryLimits[].
● Interface IAnalyzable with generateReport() and detectOverspend().
● Constructors for monthly budgets with custom categories.
● Use operators to calculate net savings: income - totalExpenses.
● Encapsulation: restrict direct expense editing.
● Inheritance: MonthlyBudget, AnnualBudget.
● Polymorphism: report format varies (monthly vs yearly).
 */

package com.week3.BudgetWise;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> cat = new HashMap<>();
        cat.put("Food", 5000.0);
        cat.put("Travel", 3000.0);
        cat.put("Shopping", 4000.0);

        MonthlyBudget mb = new MonthlyBudget(45000, 15000, cat);

        mb.addTransaction(new Transaction(1200, "expense", "Food"));
        mb.addTransaction(new Transaction(2500, "expense", "Travel"));
        mb.addTransaction(new Transaction(6000, "expense", "Shopping"));

        mb.generateReport();
        mb.detectOverspend();

        AnnualBudget ab = new AnnualBudget(600000, 200000, cat);
        ab.addTransaction(new Transaction(50000, "expense", "Food"));

        ab.generateReport();
        ab.detectOverspend();
    }
}

