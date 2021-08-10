package com.kosta.day04;

public class Car {

	String company;
	String model;
	String color;
	int maxSpeed;
	
	//1. field
	//2. constructor
	//3. method
	//4. static
	//5. inner class
	Car(){
		this(null, null, null, 0);
		// Giving up parent constructor super()
	}
	
	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	//***Called by all the other constructors.
	//Instead, super() called in this constructor.
	
	public Car(String company, String model, String color) {
		this(company, model , color, 80);
	}
	
	public Car(String company, String model) {
		this(company, model ,"red", 80);
	}
	
	
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}

	public void display() {
		System.out.println("company : " + company);
		System.out.println("model : " + model);
		System.out.println("color : " + color);
		System.out.println("maxspeed : " + maxSpeed);
	}
}
