package com.kosta.day09;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Television turn on.");

	}

	@Override
	public void turnOff() {
		System.out.println("Television turn off.");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("Television set volume.");

	}

}
