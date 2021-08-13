package com.kosta.day07;

public class OperatorExercise02 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		int score = 85;
		char result = (!(score>90))? 'a' : 'b';
		System.out.println(result);
		
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils/students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);
		
		int value = 356;
		System.out.println(value/100*100);
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (5+10)*7/2.0;
		System.out.println(area);
		
	}

}
