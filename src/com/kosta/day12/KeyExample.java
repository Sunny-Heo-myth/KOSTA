package com.kosta.day12;

import java.util.HashSet;

public class KeyExample {

	public static void main(String[] args) {
		
		f2();
	}

	private static void f2() {
		
		HashSet<Key> box = new HashSet<>();
		box.add(new Key(10));
		box.add(new Key(10));
		box.add(new Key(10));
		box.add(new Key(10));
		box.add(new Key(10));
		
		for(Key s : box) {
			System.out.println(s);
		}
	}

	private static void f1() {
		Key a = new Key(10);
		Key b = new Key(10);
		
		System.out.println(a.equals(b)? "same" : "not same");
		
	}

}
