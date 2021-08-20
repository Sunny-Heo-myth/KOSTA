package com.kosta.day12;

public class Key {

	int number;

	public Key(int number) {
		super();
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return ((Key)obj).number == number;
	}
	
	
}
