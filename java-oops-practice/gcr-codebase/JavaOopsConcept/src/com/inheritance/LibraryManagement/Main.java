package com.inheritance.LibraryManagement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book("ABC", 2004);
		Author ar = new Author("Priyanshu",2026,"PQR","DONE");
		b.displayinfo();
		ar.displayinfo();
	}

}
