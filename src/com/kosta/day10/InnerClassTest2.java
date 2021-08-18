package com.kosta.day10;

class F {

	F(){System.out.println("outer class created"); }
	
	class B{
		
		B(){System.out.println("Inner class created.");}
		
		int innerField1;
		
		void innerMethod1() {}
	}
	
	static class C{
		
		C(){System.out.println("Static inner class created."); }
		
		int innerField1;
		static int innerField2 = 2;
		
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
public class InnerClassTest2 {

	public static void main(String[] args) {
		
		System.out.println(F.C.innerField2);
		
		F f = new F();
		f.Outermethod();
		
	}

}
