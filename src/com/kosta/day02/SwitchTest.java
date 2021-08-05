package com.kosta.day02;

import java.util.Scanner;

public class SwitchTest {
	
	public static void f1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type year.");
		int year = sc.nextInt();
		System.out.println("Type month.");
		int month = sc.nextInt();
		int lastday;
		switch(month) {
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			lastday = 30;
			break;
		case 2:
			if(year%4==0 && year%100!=0 || year%400==0)
				lastday = 29;
			else
				lastday = 28;
			break;
		default:
			lastday = 31;
		}
		System.out.println(lastday);
	}
	
	public static void main(String[] args) {
		f1();
	}

}
