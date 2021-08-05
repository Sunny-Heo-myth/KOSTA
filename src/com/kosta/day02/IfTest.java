package com.kosta.day02;

public class IfTest {
	// 1. field
	// 2. constructor
	// 3. method
	// 4. static block
	// 5. inner class

	public static void f1() {
		
	}

	public static void f2() {
		int score = 70;
		if(score >= 60) {
			System.out.println("pass!");
		}else {
			System.out.println("fail!");
		}
		System.out.println("f2 method end.");
	}
	
	public static void f3() {
		// switch
		int score = 50;
		switch(score) {
		case 50 :
			System.out.println("fail!");
			break;
		case 80 :
			System.out.println("pass!");
		}
	}

	public static void main(String[] args) {
		System.out.println("program start!");
		f1();
		f2();
		f3();
		System.out.println("program end!");

	}

}
