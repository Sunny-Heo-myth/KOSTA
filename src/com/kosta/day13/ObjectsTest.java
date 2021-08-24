package com.kosta.day13;

import java.util.Arrays;

public class ObjectsTest {

	public static void main(String[] args) {
		f7();

	}

	private static void f7() {
		// TODO Auto-generated method stub
		Person p1 = new Person("Kim", "010-2132-1477", 10);
		Person p2 = new Person("Park", "010-7777-1477", 20);
		System.out.println(p1.age - p2.age);
		System.out.println(p1.compareTo(p2));
		
	}

	private static void f6() {
		// TODO Auto-generated method stub
		Person[] arr = {
		new Person("Kim", "010-2132-1477", 10),
		new Person("Park", "010-7777-1477", 20),
		new Person("Lee", "010-2132-5748", 30)
		};
		for(Person p : arr) {
			System.out.println(p);
		}
	}

	private static void f5() {
		String[] arr = {"A", "C", "B"};
		
	}

	private static void f4() {
		Tire[] arr = {new Tire("b", "Black"),
				new Tire("a", "Red"),
				new Tire("c", "Green")};

		
	}

	private static void f3() {
		int[] arr = {100, 50, 80, 30, 88, 44, 99};
		Arrays.sort(arr);
	}

	private static void f2() {
		int[] arr = {100, 50, 80, 30, 88, 44, 99};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
