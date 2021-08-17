package com.kosta.day08.inheritance;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Hankook remain rounds : " +
		(maxRotation - accumulatedRotation) + "round");
			return true;
		}else {
			System.out.println("***" + location + "Hankook PUNK***");
			return false;
		}
	}
	
}
