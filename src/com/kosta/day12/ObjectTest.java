package com.kosta.day12;

import com.kosta.day11.CellPhone;

public class ObjectTest {

	public static void main(String[] args) {
		f3();

	}

	private static void f3() {

		CellPhone obj1 = new CellPhone("galaxy10");
		
	}

	private static void f2() {
		String obj1 = new String("Java");
		String obj2 = new String("Java");
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
	}
		

	private static void f1() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
	}

}
