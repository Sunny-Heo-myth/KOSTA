package com.kosta.day12;

public class CloneTest {

	public static void main(String[] args) {
		f3();

	}

	private static void f3() {
		int[] arr = new int[] {1,2,3};
		int[] arr2 = arr;
	}

	private static void f2() {
		Book b1 = new Book("Vue.js", 20000);
		Book b2;
		try {
			b2 = (Book)b1.clone(); // shallow copy
			b1.price = 30000;
			b2.title = "what";
			System.out.println(b1);
			System.out.println(b2);
			
			System.out.println(b1.hashCode());
			System.out.println(b2.hashCode());
			
			b1.price = 30000;
			System.out.println(b1);
			System.out.println(b2);
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			b2 = (Book)b1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Book b2 = new Book("Vue.js", 20000);

		
	}

	private static void f1() {
		Book b1 = new Book("Vue.js", 20000);
		Book b2 = b1;
		//Book b2 = new Book("Vue.js", 20000);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		b1.price = 30000;
		System.out.println(b1);
		System.out.println(b2);
	}

}
