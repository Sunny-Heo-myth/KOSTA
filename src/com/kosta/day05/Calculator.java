package com.kosta.day05;

public class Calculator {
	
	String model;
	String color;
	
	public Calculator() {}

	public Calculator(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	int divide(int num1, int num2) {
		return num1 / num2;
	}
	
}
