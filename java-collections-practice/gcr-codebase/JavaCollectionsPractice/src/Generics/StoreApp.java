package Generics;

import java.util.*;

interface Category {
    String getCategoryName();
}

enum BookCategory implements Category {
    FICTION, NONFICTION;
    public String getCategoryName() {
    	return name(); 
    	}
}

enum ClothingCategory implements Category {
    MEN, WOMEN;
    public String getCategoryName() {
    	return name(); 
    	}
}

enum GadgetCategory implements Category {
    MOBILE, LAPTOP;
    public String getCategoryName() {
    	return name(); 
    	}
}

class Product<T extends Category> {
    private final String name;
    private double price;
    private final T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setPrice(double price) { this.price = price; }
    public double getPrice() { 
    	return price; 
    	}
    public String toString() { 
    	return name + " - " + category.getCategoryName() + " - " + price; 
    	}
}

class Marketplace {
    private final List<Product<? extends Category>> catalog = new ArrayList<>();

    public <T extends Category> void addProduct(Product<T> product) { 
    	catalog.add(product);
    	}

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() - (product.getPrice() * (percentage / 100));
        product.setPrice(newPrice);
    }

    public void showCatalog() {
        catalog.forEach(System.out::println);
    }
}

public class StoreApp {
    public static void main(String[] args) {
        Marketplace m = new Marketplace();

        Product<BookCategory> b = new Product<>("Atomic Habits", 500, BookCategory.NONFICTION);
        Product<ClothingCategory> c = new Product<>("T-Shirt", 800, ClothingCategory.MEN);
        Product<GadgetCategory> g = new Product<>("Smartphone", 15000, GadgetCategory.MOBILE);

        m.addProduct(b);
        m.addProduct(c);
        m.addProduct(g);

        Marketplace.applyDiscount(b, 10);
        Marketplace.applyDiscount(g, 5);

        m.showCatalog();
    }
}
