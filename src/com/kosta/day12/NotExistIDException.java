package com.kosta.day12;

public class NotExistIDException extends Exception {

	public NotExistIDException() {
		
	}
	
	public NotExistIDException(String message) {
		super(message);
	}
}
