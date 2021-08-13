package com.kosta.day08;

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java";
		Object obj = s;
		System.out.println(obj.toString());
		
		String str = (String)obj;
		System.out.println(str.toString());
	}

}
