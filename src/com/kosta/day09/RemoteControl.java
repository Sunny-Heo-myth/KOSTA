package com.kosta.day09;

public interface RemoteControl {
	
	int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("MUTE!");
		}else {
			System.out.println("UNMUTE!");
		}
	}
	
	static void changeBattery() {
		System.out.println("Change Battery!");
	}
}
