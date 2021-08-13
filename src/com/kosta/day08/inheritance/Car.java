package com.kosta.day08.inheritance;

public class Car {
	
	Tire frontLeftTire = new Tire("FL", 6);
	Tire frontRightTire = new Tire("FR", 2);
	Tire backLeftTire = new Tire("BL", 3);
	Tire backRightTire = new Tire("BR", 4);
	
	int run() {
		if(frontLeftTire.roll() == false) {stop(); return 1;}
		if(frontRightTire.roll() == false) {stop(); return 2;}
		if(backLeftTire.roll() == false) {stop(); return 3;}
		if(backRightTire.roll() == false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("Car stop!");
	}
}
