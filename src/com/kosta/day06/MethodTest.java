package com.kosta.day06;

public class MethodTest {
	int a;
	
	static {
		  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static void sum(int...arr) {
		int total = 0;
		for(int su:arr) {
			total += su;
		}
		System.out.println(total);
	}
}
