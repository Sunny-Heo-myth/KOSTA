package com.kosta.day04;

public class Book {
	String title;
	int price;
	
	public Book() {
		this("untitled", 0);
	}
	// IF there are multiple constructors in one class, 
	// one constructor can call another constructor by this().
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	
	public Book(String title) {
		this(title, 1000);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	
}
