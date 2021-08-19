package com.kosta.day11;

public enum Login_Result {
	LOGIN_SUCCESS("success", 1), 
	LOGIN_FAIL("fail", 2);
	
	String message;
	int a;
	
	Login_Result(String message, int a){
		this.message = message;
		this.a = a;
	}
}
