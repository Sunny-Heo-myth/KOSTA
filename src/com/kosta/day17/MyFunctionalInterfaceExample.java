package com.kosta.day17;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		
		MyFunctionalInterFaceVoid fiv;
		MyFunctionalInterFaceVoid fiv2;
		
		fiv = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		
		fiv.method();
		
		fiv2 = () -> System.out.println();
		fiv2.method();
		
		MyFunctionalInterface fi;
		MyFunctionalInterface fi2;
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println();
		};
		
		fi.method(1);

	}

}
