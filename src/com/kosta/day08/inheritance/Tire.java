package com.kosta.day08.inheritance;

public class Tire {

	String location;
	int accumulatedRotation = 0;
	int maxRotation = 1000;
	
	
	public Tire(String location, int maxRotation) {
		super();
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll(){
		accumulatedRotation += 1;
		if(accumulatedRotation == maxRotation) {
			System.out.println(location + " tire punk!");
			return false;
		}else {
			System.out.println("Unused cycle : " 
		+ (maxRotation-accumulatedRotation));
			return true;
		}
	}
}
