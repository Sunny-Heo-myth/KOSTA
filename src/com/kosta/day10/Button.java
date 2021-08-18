package com.kosta.day10;

public class Button {

	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	void tab() {
		listener.onKey();
	}
	
	interface OnClickListener{
		void onClick();
		void onKey();
	}
}
