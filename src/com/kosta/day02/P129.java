package com.kosta.day02;

import java.util.Scanner;

public class P129 {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.print("name? : ");
		String myName = sc.next();
		
		System.out.print("digit? : ");
		String digits = sc.next();
		
		System.out.print("score? : ");
		String score = sc.next();
		
		System.out.println(myName + '/' + digits + '/' + score);
		sc.close();

	}

}
