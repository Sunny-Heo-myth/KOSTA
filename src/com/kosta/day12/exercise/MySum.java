package com.kosta.day12.exercise;

public class MySum {
	 int first;
	 int second;
	    
	 MySum (int first, int second){
	     this.first = first;
	     this.second = second;
	 }

	@Override
	public String toString() {
		return this.first + this.second + "";
	}

	@Override
	public boolean equals(Object object) {
		if(object instanceof MySum && this.toString().equals(((MySum)object).toString())) {
			return true;
		}
		return false;
	}
	
	
	 
	 
}
