package com.kosta.day15;

public class WildCardExample {

	public static void main(String[] args) {

		Course<Person> personCourse = new Course<>("person", 5);
		Person[] ps = personCourse.getStudents();
		System.out.println(ps.length);
				

	}

}
