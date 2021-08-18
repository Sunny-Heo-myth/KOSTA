package com.kosta.day10.anonymous;

public class Button {
	OnClickListener listener;
	
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	interface OnClickListener{
		void onClick();
	}
}
