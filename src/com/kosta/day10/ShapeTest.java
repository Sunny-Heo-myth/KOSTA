package com.kosta.day10;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(5,6);
		RectTriangle b = new RectTriangle(6, 2);
		
		ArrayList<Shape> c = new ArrayList<Shape>();
		
		c.add(a);
		c.add(b);
		
		for(Shape i : c) {
			if(i instanceof Resizable) {
				Rectangle j = (Rectangle)i; 
				j.resize(0.5);
				System.out.println(j.getArea());
				System.out.println(j.getPerimeter());
			}else {
				System.out.println(i.getArea());
				System.out.println(i.getPerimeter());
			}
			
		}
	}

}
