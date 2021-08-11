package com.kosta.day06;

import com.kosta.day05.Calculator;

public class PackageTest {

	public static void main(String[] args) {
		
		System.out.println(Math.random());
		// "java.lang" do not need import.
		java.util.Date d1 = new java.util.Date();
		java.sql.Date d2 = new java.sql.Date(2021, 8, 11);
		// deprecated.
		Date d4 = new Date();
		
		System.out.println(d1);
		System.out.println(d2);
		
		Calculator cc = new Calculator();
		System.out.println();
	}

}
