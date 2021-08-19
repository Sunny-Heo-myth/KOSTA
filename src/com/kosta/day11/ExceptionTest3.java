package com.kosta.day11;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		call();

	}

	private static void call() {
		try {
			call2();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// Autonomous Exception raise
	private static void call2() throws MyException {
		int score = 10;
		
		if(score < 80) throw new MyException("fail if under 80");
		
	}

}
