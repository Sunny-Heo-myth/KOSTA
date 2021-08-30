package com.kosta.day17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {

	public static void main(String[] args) {
		
		List<Student> studentList = Arrays.asList(
				new Student("hong", 10),
				new Student("Shin", 20),
				new Student("You", 30));
		
		Stream<Student> stream = studentList.stream();
		
		stream.forEach(s -> System.out.println(s.getScore()));
	}

}
