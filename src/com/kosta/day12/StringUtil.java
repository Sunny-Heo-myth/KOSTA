package com.kosta.day12;

public class StringUtil {

	public static String concatenate(String[] str) {
		int charCount = 0;
		for(String i : str) {charCount += i.length();}
		char[] charArray = new char[charCount];
		int index = 0;
		for(String i : str) {
			char[] targetCharArray = i.toCharArray();
			for (char j : targetCharArray) {
				charArray[index] = j;
				index++;
			}
		}
		return new String(charArray);
	}
}
