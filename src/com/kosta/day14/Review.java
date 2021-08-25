package com.kosta.day14;

import java.util.Arrays;

public class Review {

	public static void main(String[] args) {
		f1();
	}

	private static void f1() {

		int[] arr = {100, 40, 70, 20, 90};
		
		System.out.println("before : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after  : " + Arrays.toString(arr));
		
	}
}
