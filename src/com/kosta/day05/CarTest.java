package com.kosta.day05;

public class CarTest {

	public static void main(String[] args) {
		Car.company = "Lamborgini";
		System.out.println(Car.company);
		// System.out.println(Car.model);
		
		// static method 
		Car.myPrint();
		
		Car c1 = new Car("ABC", 1000);
		Car c2 = new Car("ABD", 2000);
		Car c3 = new Car("ABE", 3000);
		
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.company); // Not recommended.
		
		String s = c1.toString();
		System.out.println(s);
	}

}
