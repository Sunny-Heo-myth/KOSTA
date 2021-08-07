package com.kosta.day03;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scan01 = new Scanner(System.in);
		
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		for(int i : array) {
			if(i>max) {
				max = i;
			}
		}
		System.out.println("max : " + max);

	}

}
