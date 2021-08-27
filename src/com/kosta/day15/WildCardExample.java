package com.kosta.day15;

public class WildCardExample {

	public static void main(String[] args) {

		Course<Person> personCourse = new Course<>("person", 5);
		Person[] ps = personCourse.getStudents();
		System.out.println(ps.length);
		
		personCourse.add(new Person("person"));
		personCourse.add(new Worker("worker"));
		personCourse.add(new Student());
		personCourse.add(new HighStudent());
		personCourse.add(new Person("person"));
				

	}

}
