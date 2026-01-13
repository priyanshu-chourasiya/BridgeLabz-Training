package com.week3.BudgetWise;

import java.util.*;

public abstract class Budget implements IAnalyzable {
    protected double income;
    protected double limit;
    protected HashMap<String, Double> categoryLimits;
    protected ArrayList<Transaction> transactions;

    public Budget(double income, double limit, HashMap<String, Double> categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public double totalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equals("expense")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    public double netSavings() {
        return income - totalExpenses();
    }
}

