package com.kosta.day07;

import com.kosta.day06.Coffee;

public class ModifierTest {

	// 1. static variable, method load
	// 1. static block execute
	public static void main(String[] args) {
		Coffee co;
		co = new Coffee();
		System.out.println(co.menu);
		// System.out.println(co.a); Not inherited.
		// System.out.println(co.b); Not inherited.
		
		co.f1();
		// co.f2();
		// co.f3();
		// co.f4();

	}

}
