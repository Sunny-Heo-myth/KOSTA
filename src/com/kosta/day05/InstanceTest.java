package com.kosta.day05;

public class InstanceTest {

	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		
		Computer c1 = new Computer("S123", 5000);
		Computer c2 = new Computer("L123", 6000);		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.company = "Samsung";
		c2.price = 1000;
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.display();
		c2.display();
		
		System.out.println(c1.color);
		System.out.println(Computer.color);
	}

}
