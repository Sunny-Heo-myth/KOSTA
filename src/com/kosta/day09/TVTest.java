package com.kosta.day09;

public class TVTest {

	public static void main(String[] args) {
		TV a = new LGTV();
		TV b = new SamsungTV();
		
		a.powerOn();
		b.poweroff();
		
		System.out.println(a.CHANNEL);
		
		a.turnOn();
		b.turnOn();
		
		TV ma = makeTV();
	}
	
	private static TV makeTV() {
		return new TV() {

			@Override
			public void powerOn() {
				System.out.println("Anomynous on");
				
			}

			@Override
			public void poweroff() {
				System.out.println("Anomynous off");
				
			}
			
		};
	}
}
