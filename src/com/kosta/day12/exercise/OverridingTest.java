package com.kosta.day12.exercise;

public class OverridingTest {

	public static void main(String[] args) {
		 int i = 10;
	     int j = 20;
	        
	     MySum ms1 = new MySum(i, j);
	     MySum ms2 = new MySum(i, j);
	     System.out.println(ms1);
	     System.out.println(ms1.toString());
	     System.out.println(ms2.toString());

	     if(ms1.equals(ms2)) {
	    	 System.out.println("ms1과 ms2의 합계는 동일합니다.");
	     }else {
	    	 System.out.println("fuck off.");
	     }
	}

}
