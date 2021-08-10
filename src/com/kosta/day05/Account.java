package com.kosta.day05;

public class Account {
	
	String accNo;
	int balance;
	
	public Account(String accNo) {
		this.accNo = accNo;
		this.balance = 0;
		
		System.out.println(accNo + " account has been opened.");
		this.getBalance();
	}
	
	public void getAccNo() {
		System.out.println(accNo + ", Your balance is $" + balance + ".");
	}
	
	public void getBalance() {
		System.out.println("Your account number is " + this.accNo);
	}
	
	public void save(int in) {
		this.balance += in;
		
		System.out.println(accNo + ", " + in + "$ has been deposited.");
		this.getBalance();
	}
	
	public void deposit(int out) {
		this.balance -= out;
		
		System.out.println(accNo + ", " + out + "$ has been withdrawn.");
		this.getBalance();
	}
	
}
