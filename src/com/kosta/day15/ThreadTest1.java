package com.kosta.day15;

// 1. Thread Class Inherit
// 2. 
public class ThreadTest1 extends Thread{

	public static void main(String[] args) {
		
		//f1();
		//f2();
		Runnable tc2 = new ThreadTest2();
		ThreadTest3 tc3 = new ThreadTest3();
		
		Thread t2 = new Thread(tc2);
		Thread t3 = new Thread(tc3);
		t2.start();
		t3.start();
		f3();
		System.out.println("main END");

	}

	

	private static void f3() {
		for(int i = 0; i < 26; i++) {
			System.out.println(i);
		}
		
	}

	private static void f2() {
		// TODO Auto-generated method stub
		
	}

	private static void f1() {
		// TODO Auto-generated method stub
		
	}

}
