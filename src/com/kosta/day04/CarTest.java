package com.kosta.day04;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		f2();
	}
	
	public static void f1() {
		int a;
		Car porsche; // Class object;
		porsche = new Car(); // object = new instance();
		
// object method toString always print address.
		porsche.color = "blue";
		porsche.company = "Porsche AG";
		porsche.model = "911";
		porsche.maxSpeed = 350;
		
		porsche.display();
	}
	
	public static void f2() {
		Car[] tank = new Car[5];
		
		for(int i=0; i<tank.length; i++) {
			
			System.out.println("Which car?");
			
			System.out.println("COMPANY?");
			Scanner sc = new Scanner(System.in);
			String company = sc.next();
			
			System.out.println("Model?");
			Scanner sc2 = new Scanner(System.in);
			String model = sc2.next();
			
			System.out.println("COLOR?");
			Scanner sc3 = new Scanner(System.in);
			String color = sc3.next();
			
			System.out.println("MAXSPEED?");
			Scanner sc4 = new Scanner(System.in);
			int maxSpeed = sc4.nextInt();
			
			tank[i] = new Car(company, model, color, maxSpeed);
			
			System.out.println("car" + (i+1) + " enlisted.");
			System.out.println();
		}
		
		
	}

}
