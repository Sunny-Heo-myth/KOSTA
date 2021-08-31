package com.kosta.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob1 {
	
	public static void main(String[] args) {
		String[] array={"황남기85점","조성호89점","한인성88점","독고정진77점"};
		printMaxScore(array);
	}	
	
	private static void printMaxScore(String[] array){
		
		int max = Integer.MIN_VALUE;
		String maxPerson = "없음";
		String regExpScore = "\\d{1,3}";
			
		for(int i = 0; i < array.length; i++) {
			Pattern pat = Pattern.compile(regExpScore);
			Matcher matcher = pat.matcher(array[i]);
			boolean result = matcher.find();
			
			if(result) {
				int x = Integer.parseInt(matcher.group());
				if(max < x) {
					maxPerson = array[i].split(regExpScore)[0];
					max = x;
				}
			}
		}
		System.out.println("최고점수는 " + maxPerson + "님 " + max + "점 입니다.");
	}	
}
