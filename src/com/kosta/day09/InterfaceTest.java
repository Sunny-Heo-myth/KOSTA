package com.kosta.day09;

public class InterfaceTest {

	public static void main(String[] args) {
		f1(new Television());
		f1(new Audio());
		f1(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Anomynous");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Anomynous");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("Anomynous");	
			}
		});

	}
	
	private static void f1(RemoteControl a) {
		a.turnOn();
		a.turnOff();
		a.setVolume(100);
		a.setMute(true);
		if(a instanceof SmartTelevision) {
			SmartTelevision s = (SmartTelevision)a;
			s.search("http://wow");
		}
	}

}
