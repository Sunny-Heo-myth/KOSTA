package com.kosta.day16;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {

	public static void main(String[] args) {
		IntBinaryOperator op;
		IntBinaryOperator op2;
		Calculator cal = new Calculator();
		
		//op = (a, b) -> Calculator.staticMethod(a, b);
		op = Calculator::staticMethod;
		//op2 = (a, b) -> cal.instanceMethod(a, b);
		op2 = cal::instanceMethod;

	}

}
