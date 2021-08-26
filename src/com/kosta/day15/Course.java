package com.kosta.day15;

public class Course<T> {

	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[])(new Object[capacity]);
	}

	public final String getName() {
		return name;
	}

	public final T[] getStudents() {
		return students;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final void setStudents(T[] students) {
		this.students = students;
	}
	
	public void add(T t) {
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
