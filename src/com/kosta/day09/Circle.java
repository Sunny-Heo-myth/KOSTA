package com.kosta.day09;

public class Circle extends Shape {
	
	private double radius;
	private double circumference;
	
	
	public Circle(String color, double radius) {
		super(color, "Circle");
		this.radius = radius;
	}

	
	public double getRadius() {
		return radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(radius, radius);
	}
	
	@Override
	public double calculatePerimeter() {
		return Math.PI * 2 * radius;
	}

}
