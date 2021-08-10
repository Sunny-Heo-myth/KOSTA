package com.kosta.day04;

import java.util.Arrays;

public class ReferenceTest3 {

	public static void main(String[] args) {
		int a = 10;
		f1(a);
		System.out.println("value : " + a);
		
		int[] arr = {1,2,3,4,5};
		f2(arr);
		System.out.println("value : " + Arrays.toString(arr));
	}

	private static void f2(int[] arr) {
		System.out.println("transferred arr : " + Arrays.toString(arr));
		arr[0] = 77;
	}

	private static void f1(int a) {
		System.out.println("transfered a : " + a);
		a = 99;
	}
	
}
