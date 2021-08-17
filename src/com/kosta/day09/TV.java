package com.kosta.day09;

public interface TV {
	// constant
	// abstract method
	// default method
	// static method
	
	public static final int CHANNEL = 6;
	public int CHANNEL2 = 2;
	
	
	public abstract void powerOn();
	
	public void poweroff();
	
	// Implementation of methods by using modifier default
	public default void turnOn() {
		System.out.println("added default method.");
	};
	
	public static void turnOff() {
		System.out.println("Override is impossible for static method.");
	}
	
}
