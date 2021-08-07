package com.kosta.day03;

public class ArrayTest {

	public static void main(String[] args) {
		f1();
		f2();
		int[] arr3;	//***
		arr3 = new int[]{1,2,3,4,5};	//***
		for(int i:arr3) {
			System.out.println(i);
		}
			
		int[] arr4 = {1,2,3,4,5};	//***
		int[] arr5 = {1,2,3,4,5};
		for(int i : arr4) {
			for(int j : arr5) {
				if(i == j) {
					System.out.println(true);
				}
			}
		}

		

	}
	
	public static void f2() {
		// declare
		int[] arr1;
		// declare, create
		int arr2[] = new int[3];
		// declare, create, initiate
		int[] arr3 = new int[] { 100,200,300,400 };
		
	}

	public static void f1() {
		int[][] arr;
	}

}
