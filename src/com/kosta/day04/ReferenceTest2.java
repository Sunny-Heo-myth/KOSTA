package com.kosta.day04;

import java.util.Arrays;

public class ReferenceTest2 {

	public static void main(String[] args) {
		sum(10, 20);
		sum(3.14, 10.5);
		sum('A', 'B');
		
		int[] arr = {10,20,30};
		System.out.println("before");
		sum(arr);
		System.out.println("after");
		}
	
	private static void sum(int[] arr) {
		System.out.println("before" + Arrays.toString(arr));
		arr[0] = 88;
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		System.out.println("total : " + total);
		System.out.println("after" + Arrays.toString(arr));
		
	}

	private static void sum(double d, double e) {
		System.out.println(d);
		System.out.println(e);
		System.out.println("sum : " + (d+e));
		System.out.println("========================");
		
	}

	public static void sum(int i, int j) {
		System.out.println(i);
		System.out.println(j);
		System.out.println("sum : " + (i+j)); // (i+j)
		System.out.println("========================");
	}

}
