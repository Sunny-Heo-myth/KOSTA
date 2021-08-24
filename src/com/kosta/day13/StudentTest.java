package com.kosta.day13;

import java.util.Arrays;
import java.util.Comparator;

public class StudentTest {

	public static void main(String[] args) {
		f2();
		
	}

	private static void f2() {
		Student[] arr = {
				new Student(123, "kim", 0),
				new Student(123, "heo", 10),
				new Student(123, "cha", 0),
				new Student(123, "jin", 10),
				new Student(123, "park", 0),
				new Student(123, "shin", 10),
		};
		
		System.out.println(1);
		Arrays.sort(arr);
		for(Student s : arr) {
			System.out.println(s);
		}
		
		System.out.println(2);
		Arrays.sort(arr, new Student2());
		
		System.out.println(3);
		Arrays.sort(arr, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
	}

	private static void f1() {
		Student s1 = new Student(123, "kim", 0);
		Student s2 = new Student(123, "heo", 10);
		
		System.out.println(s1.compareTo(s2));
		
	}

}
