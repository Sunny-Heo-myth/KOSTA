package com.kosta.day15;

//2 
public class ThreadTest2 extends Parent implements Runnable {

	@Override
	public void run() {
		for(char x ='a'; x <= 'z'; x++) {
			System.out.println(x);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
