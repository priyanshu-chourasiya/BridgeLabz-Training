package Generics;

import java.util.*;

abstract class SmartWarehouse
 {
    private final String name;
    SmartWarehouse(String name) {
    	this.name = name; 
    	}
    public String getName() { 
    	return name; 
    	}
    public String toString() { 
    	return name;
    	}
}

class Electronics extends SmartWarehouse {
    Electronics(String name) { 
    	super(name); 
    	}
}

class Groceries extends SmartWarehouse {
    Groceries(String name) {
    	super(name); 
    	}
}

class Furniture extends SmartWarehouse {
    Furniture(String name) { 
    	super(name);
    	}
}

class Storage<T extends SmartWarehouse> {
    private final List<T> items = new ArrayList<>();
    public void add(T item) {
    	items.add(item); 
    	}
    public List<T> all() { 
    	return items; 
    	}
}

class Warehouse {
    public static void show(List<? extends SmartWarehouse> items) {
        items.forEach(System.out::println);
    }
}

public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {
        Storage<Electronics> e = new Storage<>();
        e.add(new Electronics("Laptop"));
        e.add(new Electronics("Camera"));

        Storage<Groceries> g = new Storage<>();
        g.add(new Groceries("Milk"));
        g.add(new Groceries("Apple"));

        Warehouse.show(e.all());
        Warehouse.show(g.all());
    }
}
