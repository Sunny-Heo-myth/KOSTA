package com.kosta.day15;

public class BathroomExample {

	public static void main(String[] args) {
		Bathroom room = new Bathroom();
		
		Thread t1 = new BathRoomThread(room, "heo");
		Thread t2 = new BathRoomThread(room, "choi");
		Thread t3 = new BathRoomThread(room, "sang");
		Thread t4 = new BathRoomThread(room, "bang");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
