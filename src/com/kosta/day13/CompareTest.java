package com.kosta.day13;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f3();
	}

	private static void f3() {
		Book[] arr = {
				new Book("J", 20000),
				new Book("A", 10000),
				new Book("B", 20000),
				new Book("Z", 50000),
				new Book("F", 30000),
		};
		
		for(Book i : arr) {
			System.out.println(i);
		}
		
		Arrays.sort(arr);
		System.out.println("======================");
		for(Book i : arr) {
			System.out.println(i);
		}
		
		Arrays.sort(arr, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				int ret = o2.price - o1.price;
				if(ret == 0) {
					return o2.title.compareTo(o1.title);
				}
				return ret;
			}
			
		});
	}

}
