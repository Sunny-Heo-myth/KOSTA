package com.kosta.day10.anonymous;

public class Window {

	Button button1 = new Button();
	Button button2 = new Button();
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("Call.");
			
		}
	};
	
	public Window() {
		this.button1.setOnClickListener(listener);
		this.button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Send message.");
				
			}
		});
	}
	
}
