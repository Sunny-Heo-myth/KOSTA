package com.kosta.day05;

public class Person {
	
	static int numberOfPersons = 0;
	int age;
	String name;
	
	public Person(int age, String name) {
		super();
		// Create parent's instance first.
		this.age = age;
		this.name = name;
		
		numberOfPersons++;
	}

	public Person() {
		this(12, "Anonymous");
	}

	// Overloaded methods are interpreted 
	// with different names by compiler.

	public void selfIntroduce(int age, String name) {
		System.out.println("My name is " + name + ". I'm " + age + " years old.");
	}
	
	public static int getPopulation() {
		return numberOfPersons;
	}
	
	void smile() {
		
	}
	
	void eat() {
		
	}
	
	void calculate() {
		Calculator cal = new Calculator("ABC", "red");
		System.out.println(cal.add(10, 20));
		System.out.println(cal.sub(10, 20));
		System.out.println(cal.multiply(10, 20));
		System.out.println(cal.divide(10, 20));
	}
	
}
