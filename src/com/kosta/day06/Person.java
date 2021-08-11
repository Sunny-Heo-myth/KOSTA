package com.kosta.day06;

public class Person {
	
	String name;
	int age;
	
	final String nation = "Korea"; //Reinitialize value is not capable.
	final String ssn;
	final static int NATIONALCODE = 82;
	// Assign only once at declare or create instance.
	// Created in heap since it is created at runtime.
	
	static int numberOfPersons = 0;
	
	public Person(int age, String name, String ssn) {
		super();
		// Create parent's instance first.
		this.age = age;
		this.name = name;
		this.ssn = ssn;
		
		numberOfPersons++;
	}

	public Person() {
		this(12, "Anonymous", "000000");
	}

	// Overloaded methods are interpreted 
	// with different names by compiler.

	public void selfIntroduce(int age, String name) {
		System.out.println("My name is " + name + ". I'm " + age + " years old.");
	}
	
	public static int getPopulation() {
		return numberOfPersons;
	}
	/*
	void setNation(String nation) {
		this.nation = nation;
	}
	*/
	
	/*
	void setSsn(String ssn) {
		this.ssn = ssn;
	}
	*/
	
	
}
