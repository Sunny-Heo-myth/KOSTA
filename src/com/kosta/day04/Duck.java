package com.kosta.day04;

public class Duck {
	
	String name;
	int legs;
	double length;
	
	public Duck() {}
	
	
	public Duck(String name, int legs, double length) {
		this.name = name;
		this.legs = legs;
		this.length = length;
	}
	
	public Duck(String name) {
		this(name, 0, 0.0);
	}

	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void fly(){
		System.out.println(name + " can not fly.");
	}
	
	public void sing(){
		System.out.println(name + " can sing.");
	}


	@Override
	public String toString() {
		return "Duck [name=" + name + "]";
	}

}
