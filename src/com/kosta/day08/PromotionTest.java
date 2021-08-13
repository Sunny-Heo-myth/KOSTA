package com.kosta.day08;


class AA{ int numA = 10; }
class BB extends AA{}
class CC extends AA{ String msgC = "hello"; }
class DD extends BB{}
class EE extends CC{ int numE = 200; }



public class PromotionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1) primitive type promotion : big = small
		// 2) reference type promotion : parent = child
		// 3) primitive type casting : small = (small)big
		// 4) reference type casting : child = (child)parent
		
		AA a1 = new AA();
		BB b1 = new BB();
		
		AA b2 = new BB();
		AA c1 = new CC();
		AA d1 = new DD();
		AA e1 = new EE();
		
		BB d2 = new DD();
		CC e2 = new EE();
		
		test();
	}
	
	public static void test() {
		EE e = new EE();
		System.out.println(e.numA + e.msgC + e.numE);
		
		CC c = new EE();
		System.out.println(c.numA + c.msgC);
		
		AA a = new EE();
		System.out.println(a.numA);
	}
	
	public static void test2() {
		AA e = new EE(); // E things are not visible.
		// System.out.println(e.numA + e.msgC + e.numE);
		EE e2 = (EE)e; // E things are visible.
		System.out.println(e2.msgC + e2.numA + e2.numE);
		
		AA c = new EE();
		CC c2 = (CC)c;
		System.out.println(c2.msgC + c.numA);
		
		AA a = new EE();
		AA a2 = (AA)a;
		System.out.println(a2.numA);
	}
	
	

}
