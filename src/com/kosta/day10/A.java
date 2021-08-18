package com.kosta.day10;

public class A {
	
	int resultA = 7;
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//static B field3 = new B();
	static C field4 = new C();
	
	static void method2() {
		//B = var1 = new B();
		C var2 = new C();
	}
	
	A(){System.out.println("outer class created"); }
	
	class B{
		
		B(){System.out.println("Inner class created.");}
		
		int innerField1;
		
		void innerMethod1() {
			resultA = 77;
			innerField1 = 777;
		}
	}
	
	static class C{
		
		C(){System.out.println("Static inner class created."); }
		
		int innerField1;
		static int innerField2;
		
		void innerMethod1() {}
		static void innerMethod2() {}
	}
	
	void Outermethod() {
		
		class D{
			
			D(){System.out.println("Method inner class created."); }
			
			int innerField1;
			
			void methodInnerMethod1() {}
		}
		
		D d = new D();
		d.innerField1 = 7;
		d.methodInnerMethod1();
		
	}
		
}
