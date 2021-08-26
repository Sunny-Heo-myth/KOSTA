package com.kosta.day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Review {
	public static void main(String[] args) {
		String email = "hsymyth@naver.net";
		String regExp  = "^[a-zA-Z]\\w+@\\w+\\.(com|net)";
		
		boolean result = Pattern.matches(regExp, email);
		System.out.println(result);
		
		Pattern pp = Pattern.compile(regExp);
		Matcher mm = pp.matcher(email);
		
		System.out.println(mm.find());
		System.out.println(mm.group());
	}
}
