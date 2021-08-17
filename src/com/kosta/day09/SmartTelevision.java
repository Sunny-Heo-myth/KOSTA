package com.kosta.day09;

public class SmartTelevision implements RemoteControl, Searchable {

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

	@Override
	public void search(String url) {
		System.out.println(url + " search.");
		
	}

}
