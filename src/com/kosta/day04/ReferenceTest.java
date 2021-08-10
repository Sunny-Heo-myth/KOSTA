package com.kosta.day04;

import java.util.Arrays;

public class ReferenceTest {

	public static void main(String[] args) {
		f2();

	}
	
	public static void f1() {
		int score = 100;
		int score2 = score;
		System.out.println("score = " + score);
		System.out.println("score2 = " + score2);
		score = 99;
		System.out.println("score = " + score);
		System.out.println("score2 = " + score2);
	}

	public static void f2() {
		int[] arr = {10, 20 ,30, 40};
		int[] arr2 = arr;
		int[] arr3 = new int[4];
		int[] arr4 = new int[4];
		System.out.println("arr = " + Arrays.toString(arr));
		
		arr[0] = 99;
		arr[1] = 98;
		System.out.println("arr2 = " + Arrays.toString(arr2));
		
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		arr[0] = 99;
		arr[1] = 98;
		System.out.println("arr3 = " + Arrays.toString(arr3));
		
		arr4 = Arrays.copyOf(arr, arr.length);
		arr[0] = 99;
		arr[1] = 98;
		System.out.println("arr4 = " + Arrays.toString(arr4));
	
	}
}
