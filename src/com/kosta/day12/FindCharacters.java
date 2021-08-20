package com.kosta.day12;

public class FindCharacters {

	static int countChar(String str, char c) {
		int cnt = 0;
		for(char i : str.toCharArray()) {
			if(i == c) {
				cnt++;
			}
		}
		return cnt;
	}
}
