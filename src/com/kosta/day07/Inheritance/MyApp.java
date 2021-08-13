package com.kosta.day07.Inheritance;

public class MyApp {

	public static void main(String[] args) {
		CheckingAccount acc = new CheckingAccount("1234", "Sunny", 100000000, "1234-1234");
		acc.deposit(1000);
		
		int amount = acc.balance;
	}

}
