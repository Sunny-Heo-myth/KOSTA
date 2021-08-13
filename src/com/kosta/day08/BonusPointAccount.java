package com.kosta.day08;

import com.kosta.day07.Inheritance.Account;

public class BonusPointAccount extends Account{

	int bonusPoint;

	public BonusPointAccount(String accountNo, String ownerName, int balance, int bounsPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint = bounsPoint;
	}
	
	public void deposit(int amount) {
		super.deposit(amount);
		bonusPoint += (int)(amount*0.001);
	}
	
	
	
}
