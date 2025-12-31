package com.inheritance.LibraryManagement;

public class Author extends Book {
	
	String name;
	String bio;
	Author(String title, int publicationyear,String name,String bio) {
		super(title, publicationyear);
		this.name = name;
		this.bio = bio;
		// TODO Auto-generated constructor stub
	}
	void displayinfo() {
		System.out.println("title : " + title + " year : " + publicationyear + 
				" name : " + name + " bio : " + bio);
	}
}
