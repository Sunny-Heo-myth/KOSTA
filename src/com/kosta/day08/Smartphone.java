package com.kosta.day08;

public class Smartphone extends Phone {
	
	String model;
	int price;
	
	public Smartphone(String owner, String model, int price) {
		super(owner);
		this.model = model;
		this.price = price;
		System.out.println("Smartphone created.");
	}

	@Override
	public void internetSearch() {
		System.out.println("Smartphone serach.");

	}

}
