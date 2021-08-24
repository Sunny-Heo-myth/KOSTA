package com.kosta.day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		f3(null);
	}

	private static void f3(String str) throws ClassNotFoundException {
		Class myClass = Class.forName(str);
		Constructor[] cs = myClass.getDeclaredConstructors();
		for(Constructor c : cs) {
			System.out.println(c.getParameterCount());
			Parameter[] ps = c.getParameters();
			
		}
	}

	private static void f2() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Book b = new Book("", 10);
		Class myClass = b.getClass();
		Class<?> myClass1 = Class.forName("com.kosta.day13.Book");
		System.out.println(myClass1.getName());
		System.out.println(myClass1.getSimpleName());
	}

	private static void f1() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class<?> myClass = Class.forName("com.kosta.day13.Book");
		System.out.println(myClass.getName());
		System.out.println(myClass.getSimpleName());
	}

}
