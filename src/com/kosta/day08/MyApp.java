package com.kosta.day08;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d = new Driver();
		System.out.println("-----Vehicle-----");
		d.drive(new Vehicle("1234V"));
		System.out.println("-----Taxi-----");
		d.drive(new Taxi("1234T", 3.14, 4));
		System.out.println("-----Bus-----");
		d.drive(new Bus("1234B", 4321));
	}

}
