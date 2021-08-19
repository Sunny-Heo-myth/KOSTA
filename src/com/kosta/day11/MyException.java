package com.kosta.day11;

public class MyException extends Exception {

	MyException(String message) {
		super(message);
	}
	
	void display() {
		System.out.println("My exception occur - display method.");
	}
}
