package com.kosta.day14;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		f1();

	}

	private static void f1() {
		int[] arr1 = {100, 1, 2, 5, 200, 50, 20, 33, 66};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.binarySearch(arr1, 50));
	}

}
