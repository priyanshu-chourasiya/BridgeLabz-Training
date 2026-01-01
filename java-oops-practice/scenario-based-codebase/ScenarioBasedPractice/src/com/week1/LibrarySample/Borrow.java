package com.week1.LibrarySample;

public class Borrow {
	String bookname;
	Borrow(String bookname){
		this.bookname = bookname;
		System.out.println("Welcome to Library");
		System.out.println("Borrowed : " + bookname);
	}
}
