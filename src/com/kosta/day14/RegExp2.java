package com.kosta.day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp2 {

	public static void main(String[] args) {
		f1();

	}
	
	private static void f2() {
		String value = "";
		
	}

	private static void f1() {
		String value = "My phone number is 010-1234-5678, Your phone number is 010-3154-7643.";
		String p = "[01]{3}-(\\d{3,4})-(\\d{4})";
		
		Pattern pattern = Pattern.compile(p);
		Matcher matcher = pattern.matcher(value);
		System.out.println(matcher.find());
		System.out.println(matcher.group());
		System.out.println(matcher.group(1));
		System.out.println(matcher.group(2));
	}

}
