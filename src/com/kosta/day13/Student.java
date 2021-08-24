package com.kosta.day13;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	
	int number;
	String name;
	int score;
	
	public Student(int number, String name, int score) {
		super();
		this.number = number;
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}
	
	
}
