package com.kosta.day04;

public class PersonTest2 {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("park", 20);
		
		Car Porsche = new Car("a", "b", "c", 1);
		Coffee cc = new Coffee("aa", 2000);
		Person p3 = new Person("Sunny", 29, Porsche, cc);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
