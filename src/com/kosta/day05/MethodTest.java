package com.kosta.day05;

public class MethodTest {

	// Applying modifiers
	
	public static int f1() {
		System.out.println("-------------");
		System.out.println("--f1 method--");
		System.out.println("-------------");
		
		new MethodTest().isLeftGas(10);
		int result = plus(10, 20);
		return result;
	}
	
	public boolean isLeftGas(int gas) {
		if(gas == 0) {
			System.out.println("No gas.");
			return false;
		}else {
			System.out.println("good.");
			return true;
		}
	}
	
	private static int plus(int i, int j) {
		int result = i + j;
		return result;
	}

	public static int f2() {
		System.out.println("-------------");
		System.out.println("--f2 method--");
		System.out.println("-------------");
		return 0;
	}
	
	public static void main(String[] args) {
		
		if(args.length == 0) {
			
			return;
		}else {
			
		}
		int a = f2();
		
	}
}
