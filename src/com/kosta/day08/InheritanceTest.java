package com.kosta.day08;

/*
 * class MyString extends String{
 * }
 */
class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(char cc = 'A'; cc <= 'Z'; cc++) {
			System.out.println(cc);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
