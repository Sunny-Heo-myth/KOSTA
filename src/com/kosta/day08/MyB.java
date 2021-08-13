package com.kosta.day08;

public class MyB extends MyA{
	
	MyB(){
		super();
		System.out.println("MyB Intance!");
	}

	public void test() {
		System.out.println(field);
		method();
		}
	
	public static void main(String[] args) {
		new MyB().test();
	}
}
