package com.kosta.day09;

public class SamsungTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("Samsung on.");
		
	}

	@Override
	public void poweroff() {
		System.out.println("Samsung off.");
		
	}

	
}
