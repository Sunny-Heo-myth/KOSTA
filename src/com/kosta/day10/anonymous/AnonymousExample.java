package com.kosta.day10.anonymous;

public class AnonymousExample {

	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
		anony.field.turnOn();
		
		anony.method1();
		
		anony.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Smart TV turn on.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("Smart TV turn off.");
				
			}
			
		});

	}

}
