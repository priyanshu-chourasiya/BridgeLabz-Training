/*
 *  SmartCheckout – Supermarket Billing Queue (Queue + HashMap)
Story: At a supermarket, each checkout counter maintains a Queue of customers. Each
customer has a list of items, and a HashMap is used to fetch price and stock quickly.
Requirements:
● Add/remove customers from the queue.
● Fetch item prices from map.
● Update stock on purchase.

 */

package week1.SmartCheckout;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        HashMap<String,Integer> price = new HashMap<>();
        HashMap<String,Integer> stock = new HashMap<>();

        price.put("Milk",40);
        price.put("Bread",30);
        price.put("Eggs",6);

        stock.put("Milk",10);
        stock.put("Bread",5);
        stock.put("Eggs",12);

        q.add("Aman");
        q.add("Priya");
        System.out.println(q);

        HashMap<String,Integer> amanBuy = new HashMap<>();
        amanBuy.put("Milk",2);
        amanBuy.put("Bread",1);

        int total = 0;
        for(String item : amanBuy.keySet()){
            int qty = amanBuy.get(item);
            if(stock.get(item) >= qty){
                total += price.get(item) * qty;
                stock.put(item, stock.get(item) - qty);
            }
        }
        System.out.println("Aman Bill: " + total);
        q.poll();
        System.out.println(q);
    }
}
