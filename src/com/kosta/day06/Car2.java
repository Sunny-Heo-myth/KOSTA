package com.kosta.day06;

public class Car2 {

	private String model;
	private int price;
	// Almost every field use private modifier.
	// JavaBeans technique
	// 	field goes private.
	// 	method goes public.
	// 	Constructor goes public default.
	// VO(Value Object) : bag for data
	// DTO(Data Transfer Object) 
	public Car2() {}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
