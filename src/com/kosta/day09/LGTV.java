package com.kosta.day09;

public class LGTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("LG on.");
		
	}

	@Override
	public void poweroff() {
		System.out.println("LG off.");
		
	}

	@Override
	public void turnOn() {
		TV.super.turnOn();
		System.out.println("Overrided default method.");
	}

	
}
