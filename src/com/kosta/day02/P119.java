package com.kosta.day02;

import java.util.Scanner;

public class P119 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("rank?");
		String position = sc.next();
		int salary;
		
		switch(position) {
		case "vice_president" :
			salary = 100000; break;
		case "senior_associate" :
			salary = 50000; break;
		case "associate" :
			salary = 20000; break;
		default:
			salary = 10000; break;
		}
		
		System.out.println(position + "--->" + salary);

	}

}
