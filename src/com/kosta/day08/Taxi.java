package com.kosta.day08;

public class Taxi extends Vehicle {

	double a = 3.14;
	int persons;
	
	public Taxi(String no, double a, int persons) {
		super(no);
		this.a = a;
		this.persons = persons;
		System.out.println("Taxi created.");
	}

	public void run(){
		System.out.println("Taxi run.");
	}
}
