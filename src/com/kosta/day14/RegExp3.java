package com.kosta.day14;

import java.util.regex.Pattern;

public class RegExp3 {

	public static void main(String[] args) {
		f1();

	}

	
	private static void f1() {
		String value = "RegExr was created by gskinner.com, and is proudly hosted by Media Temple.\r\n"
				+ "\r\n"
				+ "Edit the Expression & Text to see matches. Roll over matches or the expression for details. PCRE & JavaScript flavors of RegEx are supported. Validate your expression with Tests mode.\r\n"
				+ "\r\n"
				+ "The side bar includes a Cheatsheet, full Reference, and Help. You can also Save & Share with the Community, and view patterns you create or favorite in My Patterns.\r\n"
				+ "\r\n"
				+ "Explore results with the Tools below. Replace & List output custom results. Details lists capture groups. Explain describes your expression in plain English.";
		String p = "a";
		
		boolean result = Pattern.matches(p, value);
		System.out.println(result);
		
	}

}
