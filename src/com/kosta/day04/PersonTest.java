package com.kosta.day04;

public class PersonTest {

	public static void main(String[] args) {

		Person p1;
		p1 = new Person();
		p1.name = "hong";
		p1.age = 20;
		
		Person p2 = new Person("sunny", 20);
		
		p1.study();
		p2.study();

	}

}
