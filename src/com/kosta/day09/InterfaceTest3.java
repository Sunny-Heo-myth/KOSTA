package com.kosta.day09;

abstract class MyAbstractClass{
	abstract void f0();
}

interface MyInterface1{
	int NUMBER = 1;
	void f1();
}

interface Myinterface2{
	void f2();
}

class MyClass1 extends MyAbstractClass implements MyInterface1{
	@Override
	public void f1() {}
	@Override
	void f0() {}
	
}

class MyClass2 extends MyAbstractClass implements Myinterface2{
	@Override
	public void f2() {}
	@Override
	void f0() {}
	
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		
		MyInterface1 I1 = new MyClass1();
		I1.f1();
		int x = I1.NUMBER;
	}

}
