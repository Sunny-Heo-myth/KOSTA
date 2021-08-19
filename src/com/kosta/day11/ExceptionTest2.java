package com.kosta.day11;

public class ExceptionTest2 {

	public static void main(String[] args) {
		call();
		System.out.println("main End.");
	}

	private static void call() {
		try {
			call2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void call2() throws ClassNotFoundException {
		Class.forName("com.kosta.day11.EnumTest3");
		
	}

}
