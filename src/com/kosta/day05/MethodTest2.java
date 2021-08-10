package com.kosta.day05;

public class MethodTest2 {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(1, 2);
		int result1 = add(1, 2);
		System.out.println("result1 = " + result1);
		
		double result2 = add(3.14, 5.6);
		System.out.println("result2 = " + result2);
		
		String result3 = add("Java", "C");
		System.out.println("result3 = " + result3);
	}

	private static double add(double d, double e) {
		return d + e;
	}

	private static int add(int i, int j) {
		return i + j;
	}
	
	private static String add(String i, String j) {
		return i + j;
	}
	// Only when there are different number of parameter,
	// that is overloading.
	
	public static void f3() {
		char c = 'A'; // 2byte 0 ~ 65536
		short d = -32768; // 2byte -32768 ~ 32767
		
	}
}
