/*
 * CallCenter – Customer Queue Manager (Queue + HashMap)
Story: In a telecom call center, customers are queued based on the time of call. Priority
customers have a special queue. A HashMap keeps track of the number of times each user has
called this month.
Requirements:

● Use Queue for managing incoming calls.
● Use HashMap for customer data.
● Priority Queue for VIP customers.
 */
package week1.CallCenter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	static Queue<String> normal = new LinkedList<>();
	static PriorityQueue<String> vip = new PriorityQueue<>();
	static HashMap<String,Integer> callcount = new HashMap<>();
	
	public static void addCall(String customer,boolean isvip) {
		if(callcount.containsKey(customer)) {
			callcount.put(customer,callcount.get(customer) + 1);
		}
		else {
			callcount.put(customer,1);
		}
		
		if(isvip) {
			vip.add(customer);
			System.out.println(customer + " added to vip");
		}
		else {
			normal.add(customer);
			System.out.println(customer + " added to normal");
		}
	}
	
	public static void serveNext() {
		if(!vip.isEmpty()) {
			System.out.println("serving vip : " + vip.remove());
		}
		else if(!normal.isEmpty()) {
			System.out.println("serving normal : " + normal.remove());
		}
		else {
			System.out.println("No customers to serve");
		}
	}
	
	public static void showcallhistory() {
		System.out.println("-------------");
		for(String customer : callcount.keySet()) {
			System.out.println(customer + " " + callcount.get(customer) + " calls");
		}
	}
	
	public static void showqueues() {
		System.out.println("VIP : " + vip);
		System.out.println("Normal : " + normal);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addCall("A",false);
		addCall("B",true);
		addCall("C",false);
		addCall("D",true);
		
		showqueues();
		showcallhistory();
		
		System.out.println("------");
		
		serveNext();
        serveNext();
        serveNext();
        serveNext();
        serveNext();  

        showqueues();
	}

}
