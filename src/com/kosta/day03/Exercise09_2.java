package com.kosta.day03;

import java.util.Scanner;

public class Exercise09_2 {

	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. number | 2. score | 3. list | 4. analysis 5. exit");
			System.out.println("-----------------------------------------------------");
			System.out.println("what do you want? : ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				
			}else if(selectNo == 2) {
				
			}else if(selectNo == 3) {
				
			}else if(selectNo == 4) {
				
			}else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("Goodbye.");
	}

}
