package com.kosta.day15;

public class Bathroom {
	
	synchronized void use(String name) {
		System.out.println(name + " Start");
		System.out.println(name + " poo");
		System.out.println(name + " End");
		System.out.println("close");
	}
}
