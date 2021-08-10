package com.kosta.day04;

import java.util.Arrays;

public class Review {

	public static void main(String[] args) {
		f7();
	}
	
	public static void f1() {
		
		int score = 100;
		String myname = "hong";
		
		System.out.println(score + 200);
		System.out.println(10 + myname + ".");
	}
	
	public static void f2() {
		int[] score;
		score = new int[10];
		
		System.out.println("initialized check : " + Arrays.toString(score));
		for(int i = 0; i < score.length; i++) {
			// System.out.println(score[i]);
			score[i] = i;
		}
		System.out.println("initialized check : " + Arrays.toString(score));
	}
	
	public static void f3() {
		int[] score = new int[] {10,20,30,40,50};
		// System.out.println(Arrays.toString(score));
		int total = 0;
		for(int i = 0; i < score.length; i++) {
			total += score[i];
		}
		System.out.println("total : " + total);
	}
	
	public static void f4() {
		int[] score = new int[] {10,20,30,40,50};
		// System.out.println(Arrays.toString(score));
		int total = 0;
		for(int i : score) {
			total += i;
			System.out.println(i);
		}
		System.out.println("total : " + total);
	}
	
	public static void f5() {
		 String[] arr = {"sunny", "kim", "Kang"};
		 for(String i : arr) {
			 System.out.println(i);
		 }
	}
	
	public static void f6() {
		 char[] arr2 = {'s', 'k', 'k'};
		 for(char i : arr2) {
			 System.out.println((int)i);
		 }
	}
	
	public static void f7() {
		int[][] arr;
		arr = new int[3][4];
		for(int[] i : arr) {
			System.out.print(i + "th array : ");
			
			for(int j : i) {
				System.out.print(i[j] + ", ");
			}
			System.out.println();
		}
		// double reference : arr & arr[x] is references.
	}
}
