package com.kosta.day10;

public class SoundTest {

	public static void main(String[] args) {
		
		Soundable a = new Dog();
		Soundable b = new Cat();
		
		System.out.println(a.sound());
		System.out.println(b.sound());
	}

}
