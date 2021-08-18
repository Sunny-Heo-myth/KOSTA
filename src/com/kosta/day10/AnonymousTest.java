package com.kosta.day10;

class Parent{
	int a = 10;
	void method() {
		System.out.println("Parent's method.");
	}
	
}

class Child extends Parent{

	@Override
	void method() {
		System.out.println("override parent's method.");
	}
	
}

class Child2 extends Parent{

	@Override
	void method() {
		System.out.println("override parent's method2.");
	}
	
}

interface MyInterface{
	void display();
}

class MyClassA implements MyInterface{
	public void display() {
		System.out.println("Override MyInterface in MyClassA.");
	}
}

class MyClassB implements MyInterface{
	public void display() {
		System.out.println("Override MyInterface in MyClassB.");
	}
}

public class AnonymousTest {

	public static void main(String[] args) {

		work(new Child());
		work(new Child2());
		
		work(new Parent() {
			void method() {
				System.out.println("Parent's method - anonymous.");
			}
		});
		
		Parent pp = new Parent() {
			int aa = 100;
			void test() {
				System.out.println("Additional method");
			}
			void method() {
				System.out.println("Parent's method - anonymous2.");
			}
		};
		
		work2(new MyClassA());
		work2(new MyInterface() {
			
			@Override
			public void display() {
				System.out.println("Override MyInterface - anonymous.");
				
			}
		});		
		// When one object is only be used once.
	}
	
	static void work(Parent p) {
		p.method();
	}
	
	static void work2(MyInterface i) {
		i.display();
	}
}
