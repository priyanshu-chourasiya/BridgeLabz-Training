package com.week2.FoodLoop;


public class FoodItem {

    private String name;
    private String category;
    private int price;
    private int stock; 

    public FoodItem(String name, String category, int price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
    	return name;
    	}
    public String getCategory() {
    	return category;
    	}
    public int getPrice() { 
    	return price; 
    	}

    
    protected boolean reduceStock() {
        if (stock > 0) {
            stock--;
            return true;
        }
        return false;
    }

    public boolean isAvailable() {
        return stock > 0;
    }
}

