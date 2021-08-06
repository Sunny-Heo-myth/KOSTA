package com.kosta.day02;

import java.io.IOException;

public class WhileTest {

	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed = 0;
		int keycode = 0;
		
		while(run) {
			if(keycode != 13 && keycode != 10) {
				System.out.println("-------");
				System.out.println("1. faster 2. slower 3. halt");
				System.out.println("-------");
			}
			keycode = System.in.read();
			if(keycode == 49) {
				speed++;
			}else if(keycode == 50){
				speed--;
			}else if(keycode == 52){
				run = false;
			}
		}
		System.out.println("Program end.");
	}

}
