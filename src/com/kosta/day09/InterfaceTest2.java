package com.kosta.day09;

public class InterfaceTest2 {

	public static void main(String[] args) {
		SmartTelevision a = new SmartTelevision();
		RemoteControl b = new SmartTelevision();
		Searchable c = new SmartTelevision();
		
		c.search("wow");
		
		SmartTelevision ss = (SmartTelevision)c;

	}

}
