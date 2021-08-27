package com.kosta.day16;

public class LambdaTest {
	
	static String field = "kosta";
	
	public static void main(String[] args) {
		f6();
	}

	private static void f6() {
		// TODO Auto-generated method stub
		
	}

	private static void f5() {
		AddCalculator a = (x, y)->{System.out.println(x+y);
									System.out.println(field);
									return x+y;
								};
		a.add(1, 2);				
		
	}

	private static void f4() {
		AddCalculator a = (x, y)->x+y;
		a.add(1, 2);
		
	}

	private static void f3() {
		MyInterface2 a = s->{System.out.println("para " + s);};
		a.work("java");
		
	}

	private static void f2() {
		MyInterface a = new MyClass2();
		a.go();
		
		MyInterface b = new MyInterface() {
			
			@Override
			public void go() {
				System.out.println("Implementation");
				
			}
		};
		
		MyInterface c = ()->{System.out.println("Implementation");};
		c.go();
		// Functional interface with name c.
	}

	private static void f1() {
		
		Thread t1 = new Thread(new MyClass());
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Implemented class of runnable.");
			}
		});
		//There is only one method in Runnable anonymous interface.
		Thread t3 = new Thread(()->{System.out.println("Implemented class of runnable.");});
	
		t1.start();
		t2.start();
		t3.start();
	}
}

class MyClass implements Runnable {
	public void run() {
		System.out.println("Implemented class of runnable.");
	}
}

interface MyInterface{
	abstract void go();
}

interface MyInterface2{
	abstract void work(String title);
}

class MyClass2 implements MyInterface{

	@Override
	public void go() {
		System.out.println("Implementation");
	}
	
}
