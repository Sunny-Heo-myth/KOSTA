package com.kosta.day11;

import java.io.IOException;
import java.util.Arrays;

public class ExceptionTest {

	public static void main(String[] args) {
		call6();
		System.out.println("program end.");
		
	}

	private static void call6() {
		int[] arr = new int[5];
		try {
			System.out.println(arr.length);
			System.out.println(Arrays.toString(arr));
			System.out.println(arr[5]);
			
		}catch(NullPointerException e) {
			System.out.println("null or outofbound");
			e.printStackTrace();
			
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("null or outofbound");
			a.printStackTrace();
			
		}catch(NumberFormatException n){
			System.out.println("other Exception");
			
		}
		catch(ClassCastException c){
			System.out.println("other Exception");
			
		}catch(Exception e){
			System.out.println("other Exception");
		}
		finally {
			System.out.println("unconditioned execution block.");
		}
	}

	private static void call5() {
		String message = f();
		try {
			System.out.println("Business problematic logic");
			System.out.println("length" + message.length());
		}catch(NullPointerException ex){
			System.out.println("value is null.");
		}finally {
			System.out.println("unconditioned logic");
			System.out.println("ex) resource return logic");
		}
		
		
	}

	private static String f() {
		return null;
	}
	
	private static void call4() {
		String message = f();
		
		if(message != null) {
			System.out.println("length" + message.length());
		}
		System.out.println("call4 end.");
	}// Runtime error
	
	private static void call3() throws IOException {
		int a;

		a = System.in.read();
		System.out.println(a);


	}// Compile Error (2.throw)
	
	private static void call2() {
		int a;
		
		try {
			a = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// Compile Error (1.programmer self)

	private static void call() {
		int a = 10/0;
		System.out.println("call end.");
		
	}// Runtime Exception (throw to JVM)
	
	

}
