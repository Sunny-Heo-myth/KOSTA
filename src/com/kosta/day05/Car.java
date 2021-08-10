package com.kosta.day05;

public class Car {

	// 1. static field : class variable, shared.
	
	static String company = "Porsche";
	static int count = 0;
	
	// 2. non-static field : instance variable;
	
	String model;
	int price;
	
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
		count += 1;
	}
	
	public void f1() {
		
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}
	
	public static void myPrint() {
		System.out.println("This is a static method.");
		System.out.println("company : " + company);
		// If one function is not a static method,
		// the method goes ONCE to "method memory area".
		// when an instance of the class is created. 
		// the timing of the method goes into 
		// method memory area is different."
	}
	
	// Instance block : Initiated when instance created.
	// Static block : Initiated once when the first 
	// 				moment of class loaded.
	static String color1 = "black";
	static String color2;
	static{
	
	// "this" can not be used.
	// Instance variable can not be used.
	color2 = "red"; // Saved at the last part of class load.
	System.out.println("Instance block 1");
	System.out.println("Instance block 2");
	}
	
}
