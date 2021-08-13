package com.kosta.day08;

public class AnimalTest {

	public static void work(Animal animal) {
		animal.sound();
	}
	
	public static void main(String[] args) {
		work(new Dog());
		work(new Cat());

	}

}
