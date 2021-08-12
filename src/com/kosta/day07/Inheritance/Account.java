package com.kosta.day07.Inheritance;

public class Account {

	String accountNo;
	String ownerName;
	int balance;
	int preference;
	
	public Account() {
		super();
	}

	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	

	public Account(String accountNo, String ownerName, int balance, int preference) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.preference = preference;
	}

	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) {
		if(amount > balance) {
			System.out.println("Not enough balance.");
			return 0;
		}else {
			balance -= amount;
			return amount;
		}
	}
	
}
