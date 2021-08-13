package com.kosta.day08;

public class Driver {
	
	void drive(Vehicle v) {
		System.out.println(v.a);
		
		if(v instanceof Taxi) {
			Taxi t = (Taxi)v;
			System.out.println(t.a);
			
		}else if(v instanceof Bus) {
			Bus b = (Bus)v;
			System.out.println(b.a);
			
		}else {
			
		}
		v.run();
	}
	
}
