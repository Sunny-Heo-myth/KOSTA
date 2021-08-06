package com.kosta.day03;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		System.out.println("number? : ");
		Scanner scan01 = new Scanner(System.in);

	}
	
	public static int gcd(int a, int b) {
		int min = a>b? b:a;
		for(int i = min; i >= 1; i--) {
			if(a%i == 0 && b%i == 0) {
				return i;
			}
		}
		return 0;
	}
		
}
