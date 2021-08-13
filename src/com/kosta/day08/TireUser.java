package com.kosta.day08;

public class TireUser {
	
	public static void work(Tire t) {
		t.rolling();
		
		System.out.println(t.a);
		System.out.println(t instanceof Tire);
		System.out.println(t instanceof Hankuk);
		System.out.println(t instanceof KumHo);
		
		if(t instanceof Hankuk) {
			Hankuk h = (Hankuk)t;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

			Hankuk a = new Hankuk();
			KumHo b = new KumHo();
			
			work(a);
			work(b);
			
			
	}

}
