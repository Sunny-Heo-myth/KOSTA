package com.kosta.day15;

import java.util.ArrayList;

public class ProductTest {
	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList();
		
	}

	private static void f1() {
		Product<String, Integer, String> p1 = new Product<>();
		
		p1.setKind("veges");
		p1.setModel(100);
		p1.setColor("green");
		
		int s1 = p1.getModel();
		System.out.println(s1);
	}
}
