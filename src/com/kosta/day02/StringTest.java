package com.kosta.day02;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = new String("Java");
		int num1 = 1;
		int num2 = 1;
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		s1 += "**";
		s2 += "**";
		s3 += "**";
		s4 += "**";
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		System.out.println(s1 == s2); // address compare
		System.out.println(num1 == num2); // basic data type compare
	}

}
