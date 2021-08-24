package com.kosta.day13;

import java.util.Objects;
import java.util.Properties;

public class ObjectsTest2 {

	public static void main(String[] args) {
		f2();

	}

	private static void f2() {
		System.out.println(System.getProperty("java.version"));
		
		Properties ps = System.getProperties();
		for(Object obj : ps.keySet()) {
			String key = (String) obj;
			String val = System.getProperty(key);
			System.out.println(key + "--->" + val);
		}
		
	}

	private static void f1() {
		String s1 = null;
		System.out.println(s1 == null);
		System.out.println(s1 != null);
		
		System.out.println(Objects.isNull(s1));
		System.out.println(Objects.nonNull(s1));
		
		try {
			System.out.println(Objects.requireNonNull(s1));
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
