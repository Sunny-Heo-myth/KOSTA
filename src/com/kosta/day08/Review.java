package com.kosta.day08;

class Parent{
	
	int a = 10;
	int b = 20;
	
	Parent(){}
	
	Parent(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("create heap parent");
	}
	
	void method1() {
		System.out.println("parentMade : " + (a+b));
	}
	
}

class Child extends Parent{
	
	Child(){
		super();
	}
	
	Child(int a, int b){
		super(a, b);
		System.out.println("create heap child");
	}
	
	void call() {
		System.out.println("approach to parent's field");
		System.out.println("childMade : " + (a+b));
	}
}

public class Review {

	public static void main(String[] args) {
		f1();
		f2();
		
	}
	
	private static void f1() {
		Parent p1 = new Parent();
		Parent p2 = new Parent();
		
		System.out.println(p1);
		System.out.println(p2);
	}
	
	private static void f2() {
		Child c1 = new Child();
		Child c2 = new Child();
		
		System.out.println(c1);
		System.out.println(c2);
		c1.method1();
		c1.call();
	}
	
	private static void f3() {
		//Child c1 = new Child(10, 20, 30);
	}

}
