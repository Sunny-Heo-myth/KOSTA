package com.kosta.day10;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		
		A.B b = a.new B();

		
		b.innerField1 = 7;
		b.innerMethod1();
		System.out.println(a.resultA);
		System.out.println(b.innerField1);

		A.C c = new A.C();
		c.innerField1 =7;
		c.innerMethod1();
		
		c.innerField2 = 7;
		c.innerMethod2();
		
		a.Outermethod();
	}

}
