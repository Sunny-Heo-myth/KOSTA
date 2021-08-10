package com.kosta.day04;

public class Sparrow {

	String name;
	int legs;
	double length;
	
	public Sparrow() {}
	
	
	public Sparrow(String name, int legs, double length) {
		this.name = name;
		this.legs = legs;
		this.length = length;
	}
	
	public Sparrow(String name) {
		this(name, 0, 0.0);
	}


	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void fly(){
		System.out.println(name + " can fly.");
	}
	
	public void sing(){
		System.out.println(name + " can sing.");
	}


	@Override
	public String toString() {
		return "Sparrow [name=" + name + "]";
	}
}
