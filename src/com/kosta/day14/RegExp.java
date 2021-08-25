package com.kosta.day14;

import java.util.regex.Pattern;

public class RegExp {
	
	public static void main(String[] args) {
		f5();
	}

	private static void f5() {
		String value = "010-1234-5678";
		String p = "";
		boolean result = Pattern.matches(p, value);
		System.out.println(result);
		
	}

	private static void f4() {
		String value = "hsymyth0713@naver.com";
		String p = "\\w+@naver\\.\\w+()?";
		
		boolean result = Pattern.matches(p,  value);
		System.out.println(result);
		
	}

	private static void f3() {
		String value = "AAAABBBBBBCCC";
		String p = "[A]{3,}\\w{5,}[C]{3,}";
		
		boolean result = Pattern.matches(p,  value);
		System.out.println(result);
		
	}

	private static void f2() {
		String value = "AAAABBBBBBCCC";
		String p = "[A]{3,}[B]{3,}[C]{3,}";
		
		boolean result = Pattern.matches(p,  value);
		System.out.println(result);
		
	}

	private static void f1() {
		String value = "010-1234-5678";
		String p = "[01]{3}-[0-9]{4}-\\d{4}";
		
		boolean result = Pattern.matches(p, value); 
		System.out.println(result);
	}
	
	
}
