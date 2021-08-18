package com.kosta.day10;

public class OuterClassA {
// 1. field
// 2. constructor
// 3. method
// 4. static/instance block
// 5. inner class
	int a = 1;
	static String s = "Outer field";
	
	
	
	
	
	
	
	
	
	
	
	
	
	class InnerClassA{
		// 1. field
		// 2.
		// 3.
		// 4.
		// 5.
		
		int a = 10;

		void f1() {
			System.out.println("Instance inner class f1.");
		}
	}
	
	static class InnerClassB{
		static int b = 2;
		
		static void f2() {
			System.out.println("Static inner class f2.");
		}
	}

}
