package com.kosta.day04;

public class PlayBird {

	public static void main(String[] args) {
		
		Duck d1 = new Duck("QuackQuack");
		Sparrow s1 = new Sparrow("ChirpChirp");
		
		d1.fly();
		d1.sing();
		System.out.println(d1);
		s1.fly();
		s1.sing();
		System.out.println(s1);
		
	}

}
