package com.kosta.day13;

import java.io.IOException;

public class StringTest {

	public static void main(String[] args) throws IOException {
		f2();

	}

	private static void f2() throws IOException {
		byte[] bytes = new byte[100];
		int ret = System.in.read(bytes);
		System.out.println(new String(bytes));
		String s1 = new String(bytes); 
		// Carriage return & new line so + 2
		System.out.println(new String(bytes, 0, ret-2));
	}

	private static void f1() throws IOException {
		byte[] bytes = new byte[100];
		System.out.println("input>>>");
		int a = System.in.read();
		while(a != 13) {
			System.out.println("output >> " + (char)a);
		}
	}

}
