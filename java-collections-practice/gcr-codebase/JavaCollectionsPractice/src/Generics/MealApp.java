package Generics;

import java.util.*;

interface MealPlan {
    String getType();
}

class VegetarianMeal implements MealPlan {
    public String getType() {
    	return "Vegetarian";
    	}
    public String toString() {
    	return getType(); 
    	}
}

class VeganMeal implements MealPlan {
    public String getType() { 
    	return "Vegan"; 
    	}
    public String toString() { 
    	return getType();
    	}
}

class KetoMeal implements MealPlan {
    public String getType() {
    	return "Keto"; 
    	}
    public String toString() { 
    	return getType(); 
    	}
}

class HighProteinMeal implements MealPlan {
    public String getType() { 
    	return "High-Protein";
    	}
    public String toString() { 
    	return getType(); 
    	}
}

class Meal<T extends MealPlan> {
    private final List<T> meals = new ArrayList<>();
    public void add(T meal) { 
    	meals.add(meal); 
    	}
    public List<T> all() {
    	return meals;
    	}
}

class MealGenerator {
    public static <T extends MealPlan> T generate(T meal) {
    	return meal; 
    	}
}

public class MealApp {
    public static void main(String[] args) {
        Meal<VegetarianMeal> veg = new Meal<>();
        veg.add(new VegetarianMeal());

        Meal<VeganMeal> vegan = new Meal<>();
        vegan.add(new VeganMeal());

        Meal<KetoMeal> keto = new Meal<>();
        keto.add(new KetoMeal());

        VegetarianMeal m1 = MealGenerator.generate(new VegetarianMeal());
        KetoMeal m2 = MealGenerator.generate(new KetoMeal());

        System.out.println(m1);
        System.out.println(m2);
    }
}

