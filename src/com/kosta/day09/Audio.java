package com.kosta.day09;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Audio turn on.");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio turn off.");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("Audio set volume.");

	}

}
