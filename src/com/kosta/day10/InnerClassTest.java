package com.kosta.day10;

public class InnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		call();
	}

	private static void call() {
		
		// static fields & methods
		System.out.println(OuterClassA.s);
		System.out.println(OuterClassA.InnerClassB.b);
		OuterClassA.InnerClassB.f2();
		System.out.println("************************************");
		
		OuterClassA outer = new OuterClassA();
		System.out.println(outer.a);
		System.out.println("************************************");
		
		OuterClassA.InnerClassA inner = outer.new InnerClassA();
		System.out.println(inner.a);
		inner.f1();
		
		OuterClassA outer2 = new OuterClassA();
		//OuterClassA.InnerClassB inner2 = outer2.new InnerClassB();
		
	}
	
	private static void call2() {
		System.out.println("Class in method");
		System.out.println(" static inner class is illogical.");
		
		class LocalClass{
			int a = 100;
			
			void f1() {
				System.out.println("method of class in method");
			}
		}
		
		
	}
}
