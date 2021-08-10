package com.kosta.day04;

public class Coffee {
	String name;
	int price;
	
	public Coffee(String name, int price){
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + "]";
	}
}
