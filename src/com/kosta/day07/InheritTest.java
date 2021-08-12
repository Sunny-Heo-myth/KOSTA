package com.kosta.day07;

class Parent extends Object{
	static int parentVariable = 100;
	String name = "hong";
	
	Parent(){
		System.out.println("Parent's default constructor");
	}
	
	void parentMethod() {
		System.out.println("Parent's method.");
	}
}

class Child extends Parent{
	static int childVariable = 200;
	String name = "sunny";
	
	Child(){
		System.out.println("Child's default constructor");
	}
	
	void childMethod() {
		System.out.println("Child's method.");
	}
	
	public void parentMethod() {
		System.out.println("widely referencable.");
	}
}

public class InheritTest {

	public static void main(String[] args) {

		Parent b = new Parent();
		Child c = new Child();
		
		System.out.println(c.parentVariable);
		System.out.println(c.childVariable);
		System.out.println(c.name);
		c.parentMethod();
		c.childMethod();
		b.parentMethod();
		c.parentMethod();
	}

}
