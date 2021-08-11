package com.kosta.day06;

import java.util.Calendar;

public class MySingletonTest {

	public static void main(String[] args) {
		
		MySingleton a = MySingleton.getInstance();
		MySingleton b = MySingleton.getInstance();
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a == b);
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		System.out.println(cal1 == cal2);
	}

}
