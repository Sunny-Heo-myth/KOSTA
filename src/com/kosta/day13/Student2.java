package com.kosta.day13;

import java.util.Comparator;

public class Student2 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.number - o2.number;
	}

}
