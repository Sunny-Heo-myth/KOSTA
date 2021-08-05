package com.kosta.day02;

public class P115 {

	public static void main(String[] args) {
		int total = 0;
		for(int i=1; i<=5; i++) {
			int score = (int)Math.random()*20 + 81;
			total += score;
			System.out.println(score);
			System.out.println(i==5? "=" : "+");
		}
		System.out.println(total);
		System.out.println(total/5.0);
	}

}
