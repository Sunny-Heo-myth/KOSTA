package com.kosta.day03;

import java.util.Scanner;

public class Exercise08 {
	
	public static void main(String[] args) {
		
		System.out.print("number? : ");
		Scanner scan01 = new Scanner(System.in);
		int x = scan01.nextInt();
		
		boolean y = prime(x);
		if(y == true) {
			System.out.println("prime");
		}else {
			System.out.println("composite.");
		}
		
		System.out.println("<<Exercise 8>>");
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		for(int[] i : array) {
			for(int j : i) {
				sum += j;
			}
		}
		
		avg = sum/10;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
	}
	
	public static boolean prime(int num) {
		if(num == 1) {
			System.out.println("Neither prime or composite.");
			return false;
		}else if(num == 2){
			return true;
		}else {
			for(int i=2; i<=num; i++) {
				if(num%i != 0) {
					continue;
				}else {
					return false;
				}
			}
			return true;
		}
		
	}

}
