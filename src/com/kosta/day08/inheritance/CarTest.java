package com.kosta.day08.inheritance;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.frontRightTire = new HankookTire();
		myCar.backLeftTire = new KumhoTire();
		
		myCar.run();
	}

}
