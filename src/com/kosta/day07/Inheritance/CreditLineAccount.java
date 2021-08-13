package com.kosta.day07.Inheritance;

public class CreditLineAccount extends Account {

	int creditLine;

	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	
}
