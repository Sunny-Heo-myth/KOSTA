package com.kosta.day10;

public class Rectangle extends Shape implements Resizable {

	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double s) {
		this.width *= s;
		this.height *= s;
	}

	@Override
	public int getNumSides() {
		return 4;
	}

	@Override
	public double getArea() {
		return this.width * this.height;
	}

	@Override
	public double getPerimeter() {
		return (this.width + this.height) * 2;
	}

}
