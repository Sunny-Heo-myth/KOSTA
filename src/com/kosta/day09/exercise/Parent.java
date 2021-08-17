package com.kosta.day09.exercise;

public class Parent {
	
	public String name;
	public String nation;
	public static int a = 1;

	public Parent() {
		this("Korea");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String antion) call");
	}
	
}

