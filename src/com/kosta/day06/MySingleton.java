package com.kosta.day06;

public class MySingleton {

	static MySingleton my;
	
	private MySingleton() {
		System.out.println("default constructor");
	}
	
	public static MySingleton getInstance() {
		if(my == null) {
			my = new MySingleton();
		}
		return my;
	}

}
