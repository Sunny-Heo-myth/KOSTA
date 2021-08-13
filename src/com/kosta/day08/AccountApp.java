package com.kosta.day08;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void f1() {
		BonusPointAccount acc = new BonusPointAccount("1234", "hong", 1000, 10);
		acc.deposit(2000);
		acc.deposit(2000);
		acc.deposit(2000);
		int amount = acc.withdraw(500);
		
	}

}
