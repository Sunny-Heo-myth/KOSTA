package com.kosta.day02;

import java.util.Scanner;

public class JudgeEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type number >> ");
		int su = sc.nextInt();
		
		if(su%2 == 0) {
			System.out.println("even!");
		}else {
			System.out.println("odd!");
		}

	}

}
