package com.kosta.day13;

public class Book implements Comparable<Book>{

	String title;
	int price;
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.price - o.price;
	}
	
	
	
}
