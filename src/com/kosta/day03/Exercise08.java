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
