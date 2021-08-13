package com.kosta.day08;

public abstract class Phone {

	String owner;
	
	public Phone(String owner){
		this.owner = owner;
		System.out.println("Phone created.");
	}
	
	public void turnOn() {
		System.out.println("Phone turn on.");
	}
	
	public void turnOff() {
		System.out.println("Phone turn off.");
	}
	
	public abstract void internetSearch();
}
