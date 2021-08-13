package com.kosta.day08;

public class Bus extends Vehicle {
	
	char a = 'A';
	int busNo;
	
	public Bus(String no, int busNo) {
		super(no);
		this.busNo = busNo;
		System.out.println("Bus created.");
	}
	public void run(){
		System.out.println("Bus run.");
	}
}
