package com.kosta.day02;

public class Lunar {

	public static void f2(int year) {
		String a = "Lunar";
		String b = "normal";
		
		if(year%400 == 0) {
			System.out.println(a);	
		}else if(year%100 == 0){
			System.out.println(b);
		}else if(year%4 == 0){
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}
		
	public static void f3(int year, int month) {
		
		if(month == 4 || month == 6 || 
				month == 9 || month == 11) {
			System.out.println(30);
			
		}else if(month == 2){
			if(year%4 == 0 && year%100 != 0 || year%400 == 0){
				System.out.println(29);
			}else{
				System.out.println(28);
			}
			
		}else {
			System.out.println(31);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		f3(2100, 2);
	}

}
