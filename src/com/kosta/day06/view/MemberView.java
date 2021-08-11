package com.kosta.day06.view;

import com.kosta.day06.model.MemberDTO;

// View is front and print side.
public class MemberView {

	public static void display(MemberDTO member) {
		System.out.println("*******************************");
		System.out.println(member);
		System.out.println("*******************************");
	}
	
	public static void display(String message) {
		System.out.println("*******************************");
		System.out.println(message);
		System.out.println("*******************************");
	}
}
