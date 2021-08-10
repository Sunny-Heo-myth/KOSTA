package com.kosta.day04;

public class Person {
	// 1. field is variable.
	// 2. method is function.
	String name;
	int age;
	Car car;
	Coffee coffee;
	
	Person(){
		System.out.println("heap memory allocated with 0 arg.");
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("heap memory allocated with 2 args.");
	}
	
	public Person(String name, int age, Car car, Coffee coffee) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
		this.coffee = coffee;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + ", coffee=" + coffee + "]";
	}

	public void study() {
		System.out.println(name + " study.");
	}
}
