package com.kosta.day17;

public class UnderflowTest {

	public static void main(String[] args) {

		int a = 123456770;
		float b = a;
		int c = (int)b;
		System.out.println(c);
		
		int d = 8388607;
		float e = d;
		int f = (int)e;
		System.out.println(f);
		
	}

}
