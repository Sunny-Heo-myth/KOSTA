package com.kosta.day10;

import com.kosta.day10.Button.OnClickListener;

public class CallListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("call!");

	}

	@Override
	public void onKey() {
		System.out.println("picture!");

	}

}
