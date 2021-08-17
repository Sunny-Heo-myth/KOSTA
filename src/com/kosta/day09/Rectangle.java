package com.kosta.day09;

public class Rectangle extends Shape {

	private double length;
	private double width;
	
	
	public Rectangle(String color, double length, double width) {
		super(color, "Rectangle");
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return length * width;
	}

	@Override
	public double calculatePerimeter() {
		return (length + width) * 2;
	}

}
