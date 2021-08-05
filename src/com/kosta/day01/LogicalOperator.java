package com.kosta.day01;

public class LogicalOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(b++);
		System.out.println(++b);
		
		boolean result1 = a < 10 && b >= 20;
		boolean result2 = a < 10 & b >= 20; //Second statement executed.
		System.out.println(result1);
		System.out.println(result2);
		
		boolean result3 = a == 10 || b >= 20;
		boolean result4 = a >= 10 | b >= 20; //Second statement executed.
		System.out.println(result3);
		System.out.println(result4);
	}

}
