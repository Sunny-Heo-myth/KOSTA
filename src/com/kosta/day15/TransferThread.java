package com.kosta.day15;

public class TransferThread extends Thread{

	ShareArea share;
	
	public TransferThread(ShareArea share) {
		super();
		this.share = share;
	}

	@Override
	public void run() {
		// transfer 12 times.
		for(int i = 0; i<12; i++) {
			int amount = share.lee.withdraw(100);
			System.out.println("sung");
			share.sung.save(amount);
		}
	}

}
