package com.kosta.day10;

public class Outter {

	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
			
		class Nested{
			String field = "Nested-field";
			
			void method() {
				System.out.println("Nested-method");
			}
			
			void print() {
				System.out.println(this.field);
				this.method();
				System.out.println(Outter.this.field);;
				Outter.this.method();
			}
		}
		
	public void method1(int arg) {
		int localVariable = 1;
		
		//arg = 100;
		// localVariable = 100;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
		// All variables that can be used in local class is FINAL.
	}
}
