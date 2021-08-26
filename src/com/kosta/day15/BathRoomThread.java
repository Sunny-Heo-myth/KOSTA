package com.kosta.day15;

public class BathRoomThread extends Thread{

	Bathroom room;
	String name;
	
	public BathRoomThread(Bathroom room, String name) {
		super();
		this.room = room;
		this.name = name;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 3; i++) {
			room.use(name);
		}
	}
	
	
}
