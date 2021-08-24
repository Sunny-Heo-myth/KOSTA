package com.kosta.day13;

public class Person implements Comparable<Person>{

	String name;
	String phone;
	int age;
	
	public Person(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age = o.age;
	}
	
	
}
