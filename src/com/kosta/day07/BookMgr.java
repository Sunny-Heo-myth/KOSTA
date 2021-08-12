package com.kosta.day07;

public class BookMgr {
	
	private Book[] bookList;
	
	public BookMgr() {}
	
	public BookMgr(Book[] booklist) {
		super();
		this.bookList = booklist;
	}
	
	public void printBookList() {
		for(Book i : bookList) {
			i.toString();
		}
	}
	
	public void printTotalPrice() {
		
		int total = 0;
		for(Book i : bookList) {
			total += i.getPrice();
			System.out.println(total);
		}
	}

	public static void main(String[] args) {
		
		

	}

}
