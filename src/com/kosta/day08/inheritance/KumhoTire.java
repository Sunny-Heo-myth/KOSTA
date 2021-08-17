package com.kosta.day08.inheritance;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Kumho remain rounds : " +
		(maxRotation - accumulatedRotation) + "round");
			return true;
		}else {
			System.out.println("***" + location + "Kumho PUNK***");
			return false;
		}
	}
}
