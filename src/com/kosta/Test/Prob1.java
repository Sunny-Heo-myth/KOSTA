package com.kosta.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob1 {
	
	public static void main(String[] args) {
		String[] array={"Ȳ����85��","����ȣ89��","���μ�88��","��������77��"};
		printMaxScore(array);
	}	
	
	private static void printMaxScore(String[] array){
		
		int max = Integer.MIN_VALUE;
		String maxPerson = "����";
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
		System.out.println("�ְ������� " + maxPerson + "�� " + max + "�� �Դϴ�.");
	}	
}
