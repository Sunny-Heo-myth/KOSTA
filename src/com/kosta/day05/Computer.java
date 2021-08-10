package com.kosta.day05;

public class Computer {
	
	String company = "KOSTA";
	String model;
	int price;
	
	static String color = "black";
	
	public Computer(String string, int i) {
		this.model = string;
		this.price = i;
	}
	
	public void display() {
		System.out.println("display");
	}

	@Override
	public String toString() {
		return "Computer [company=" + company + ", model=" + model + ", price=" + price + "]";
	}



}
