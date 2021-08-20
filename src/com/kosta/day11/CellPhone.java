package com.kosta.day11;

public class CellPhone {

	String model;
	double battery;
	
	public CellPhone(String model) {
		super();
		this.model = model;
	}
	
	void call(int time) {
		
		try {
			if(time < 0.0) throw new IllegalArgumentException("Call time exceed exception.");
			System.out.println("Call time : " + time + "min");
			battery -= (time * 0.5);
			if(battery < 0.0) {battery = 0.0;}
		}
		catch(IllegalArgumentException i) {
			System.out.println(i.getMessage());
		}
	}
	
	void charge(int time) {
		
		try {
			if(time < 0.0) throw new IllegalArgumentException("Charge time exceed exception.");
			System.out.println("Charge time : " + time + "min");
			battery += (time * 3);
			if(battery > 100.0) {battery = 100.0;}
		}catch(IllegalArgumentException i){
			i.getMessage();
		}
	}
	
	void printBattery() {
		System.out.println("Remaining battery : " + battery);
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject instanceof CellPhone && 
				((CellPhone) otherObject).model == this.model) {
			return true;
		}else {
			return false;
		}
	}
}
