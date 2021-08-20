package com.kosta.day12;

public class BookTest {

	public static void main(String[] args) {
		f1();

	}

	private static void f1() {
		Book b1 = new Book("physics lecture", 20000);
		Book b2 = new Book("discrete mathmatics", 10000);
		
		System.out.println(b1);
		System.out.println(b1.hashCode());
		System.out.println(System.identityHashCode(b1));
		System.out.println("-------------------------------");
		System.out.println(b2);
		System.out.println(b2.hashCode());
		System.out.println(System.identityHashCode(b2));
	}

}
