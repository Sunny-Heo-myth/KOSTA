package com.kosta.day08.inheritance;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
		
			switch(problemLocation) {
			case 1:
				System.out.println("FrontLeft change with HankookTire.");
				car.frontLeftTire = new HankookTire("FrontLeft", 15);
				break;
			case 2:
				System.out.println("FrontRight change with KumhoTire.");
				car.frontLeftTire = new KumhoTire("FrontRight", 13);
				break;
			case 3:
				System.out.println("BackLeft change with HankookTire.");
				car.frontLeftTire = new HankookTire("BackLeft", 14);
				break;
			case 4:
				System.out.println("BackRight change with KumhoTire.");
				car.frontLeftTire = new KumhoTire("BackRight", 17);
				break;
			}
			System.out.println("----------------------------------");
		}
	}
}
