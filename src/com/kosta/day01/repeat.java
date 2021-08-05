package com.kosta.day01;

public class repeat {

	public static void main(String[] args) {
		int score = 100;
		char grade;
		
		switch(score/10) { //Execution time differed by value is identical.
		case 10:
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F';
		}
		
		System.out.println(grade);
		
		int x = 12;
		
		if(x/3 == 0) {
			System.out.println(3);
		}
		if(x/4 == 0) {
			System.out.println(4);
		}
		
		short year =2004;
		String a = "lunar";
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

	private static void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
