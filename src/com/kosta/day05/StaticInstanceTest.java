package com.kosta.day05;

public class StaticInstanceTest {

	public static void main(String[] args) {
		f1();
		f2();

	}

	private static void f1() {
		
		char[] arr = {'a', 'b', 'c'};
		String result = String.valueOf(arr);
		System.out.println("char[] -> String : " + result);
		
		String s = new String("Java");
		s.charAt(0);
	
	}
	
	private static void f2() {
		System.out.println(Integer.max(10, 20));
		System.out.println(Integer.MAX_VALUE);
		
		Integer a = 100; // Autoboxing
		int result = Integer.compare(30, 30);

		System.out.println(result);
		System.out.println(a);
		System.out.println(a.intValue());
		System.out.println(a.floatValue());
		
	}
}
