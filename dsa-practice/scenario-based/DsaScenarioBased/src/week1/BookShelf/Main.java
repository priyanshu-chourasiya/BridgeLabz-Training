package week1.BookShelf;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,LinkedList<Book>> hashmap = new HashMap<>();
		
		if(! hashmap.containsKey("ABC")) {
			hashmap.put("ABC", new LinkedList<>());
		}
		
		LinkedList<Book> list = hashmap.get("ABC");
		
		Book book = new Book("ABC","Priyanshu");
		list.add(book);
		
		Book b2 = new Book("MONEY","Bhati");
		list.add(b2);
		
		for(Book b : list) {
			System.out.println(b.aurthor + " " + b.title);
		}
		
//		if(hashmap.containsKey("ABC")) {
//			list.remove(book);
//		}
		System.out.println("----------");
		
		for(Book b : list) {
			if(b.title.equals("ABC")){
				list.remove(b);
				break;
			}
		}
		for(Book b : list) {
			System.out.println(b.aurthor + " " + b.title);
		}
		System.out.println("----------");
//		Book b3 = new Book("MONEY","Bhati");
//		list.add(b3);
		
		Book b4 = new Book("PSY","Anda");
		
		boolean flag = true;
		for(Book b : list) {
			if(b.title.equals(b4.title)) {
				System.out.println("Dupplicate found");
				flag = false;
				break;
			}
		}
		if(flag == true) {
			list.add(b4);
		}
		
		
		for(Book b : list) {
			System.out.println(b.aurthor + " " + b.title);
		}
		System.out.println("----------");
		
		if(!hashmap.containsKey("SCI-FI")) {
		    hashmap.put("SCI-FI", new LinkedList<>());
		    hashmap.get("SCI-FI").add(new Book("SPACE", "Priyanshu"));
		}

		
		for(Book b : list) {
			System.out.println(b.aurthor + " " + b.title);
		}
		System.out.println("----------");
		
	}

}
