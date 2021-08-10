package com.kosta.day04;

import java.util.Scanner;

public class BookManager {

	public static void main(String[] args) {
		
		Book[] shelf = new Book[5];
		
		
		
		for(int i=0; i<shelf.length; i++) {
			
			System.out.println("Which book?");
			
			System.out.println("Title?");
			Scanner sc = new Scanner(System.in);
			String title = sc.next();
			
			System.out.println("Price?");
			Scanner sc2 = new Scanner(System.in);
			int price = sc2.nextInt();
			
			shelf[i] = new Book(title, price);
			
			System.out.println("book" + (i+1) + " enlisted in shelf.");
			System.out.println(shelf[i].toString());
			System.out.println("_______________________");
		}
		
		int total = 0;
		for(Book i : shelf) {
			total += i.price;
		}
		System.out.println("There are " + shelf.length + " books on shelf.");
		System.out.println("The price of whole book on shelf is " + total + ".");
		
	}
	
}