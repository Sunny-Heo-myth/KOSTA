package com.kosta.Test;

import java.util.Arrays;

public class Prob2 {

	public static void main(String[] args) throws IllegalSizeException {
		System.out.println(leftPad("Samsung",10,'#'));
		System.out.println(leftPad("SDS",5,'*'));
		System.out.println(leftPad("Multicampus",5,'@'));
		
	}

	public static String leftPad(String str, int size, char fillChar) throws IllegalSizeException{
		if(str.length() <= size) {
			int indexDifference = size - str.length();
			byte[] strArray = str.getBytes();
			char[] result = new char[size];
			Arrays.fill(result, fillChar);
			
			for(int i = 0; i < str.length(); i++) {
				result[indexDifference + i] = (char)strArray[i];
			}
			return new String(result);
			
		}else {
			throw new IllegalSizeException("문자열의 길이보다 size가 큽니다.");
		}
	}
	
	
}

//구현하시오.
@SuppressWarnings("serial")
class IllegalSizeException extends Exception {
	 
	public IllegalSizeException() {}
	 
	public IllegalSizeException(String message) {
		super(message);
	}
}



