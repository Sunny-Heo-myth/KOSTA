package com.kosta.day02;

public class P118 {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;
		System.out.println(time);
		switch (time) {
		case 8:
			System.out.println("go to work");
		case 9:
			System.out.println("working");

		default:
			System.out.println("field");
		}
	}

}
