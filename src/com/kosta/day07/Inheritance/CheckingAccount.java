package com.kosta.day07.Inheritance;

public class CheckingAccount extends Account{

	String cardNo;
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	public CheckingAccount(String accountNo, String ownerName, int balance, int preference, String cardNo) {
		super(accountNo, ownerName, balance);
		this.preference = preference;
		this.cardNo = cardNo;
	}

	int pay(String cardNo, int amount) {
		if(!cardNo.equals(this.cardNo)) {
			System.out.println("Wrong cardNo!");
			return 0;
		}else {
			return withdraw(amount);
		}
	}
}
