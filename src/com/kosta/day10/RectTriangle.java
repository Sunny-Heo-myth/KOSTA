package com.kosta.day10;

public class RectTriangle extends Shape {

	private double width;
	private double height;
	
	public RectTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public int getNumSides() {
		return 3;
	}

	@Override
	public double getArea() {
		return this.height * this.width / 2;
	}

	@Override
	public double getPerimeter() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)) + 
				width + height;
	}

}
