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
	    	 System.out.println("ms1�� ms2�� �հ�� �����մϴ�.");
	     }else {
	    	 System.out.println("fuck off.");
	     }
	}

}
