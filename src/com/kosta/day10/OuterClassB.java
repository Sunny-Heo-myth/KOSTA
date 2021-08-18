package com.kosta.day10;

public class OuterClassB {

	int a = 10;
	static int b = 20;
	
	void method1() {
		System.out.println("instance method a = " + a +", b =" + b);
	}
	
	static void method2() {
		System.out.println("static method b = " + b);
	}
	
	class InnerClass{
		
		int a = 10;
		//static int b = 20;
		
		void method1() {
			System.out.println("instance method a = " + a +", b =" + b);
		}
		
		//static void method2() {
		//	System.out.println("static method b = " + b);
		//}		
	}
	
	static class InnerClassC{
		
		int a = 10;
		static int b = 20;
		
		void method1() {
			System.out.println("instance method a = " + a +", b =" + b);
		}
		
		static void method2() {
			System.out.println("static method b = " + b);
		}		
	}
	
	void method3() {
		class InnerClassD{
			
			int a = 10;
			//static int b = 20;
			
			void method1() {
				System.out.println("instance method a = " + a +", b =" + b);
			}
			
			//static void method2() {
			//	System.out.println("static method b = " + b);
			//}		
		}
		
		InnerClassD d = new InnerClassD();
		System.out.println(d.a);
		d.method1();
	}
}
