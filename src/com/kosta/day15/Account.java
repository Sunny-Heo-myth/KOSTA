package com.kosta.day15;

public class Account {
	
	private String accNo;
	private int balance;
	public Account(String accNo) {
		this.accNo = accNo;
		myPrint("계좌가 개설되었습니다.");
	}
	//함수를 만드는 목적은 재사용
	void myPrint(String msg) {
		System.out.println(getAccNo() + msg);
		System.out.println(accNo + "계좌의 잔고가 " + getBalance() + "만원입니다.");
	}
	
	public void save(int amount) {
		balance += amount;
		myPrint(amount + "만원이 입금되었습니다.");
	}
	public void deposit(int amount) {
		balance -= amount;
		myPrint(amount + "만원이 출금되었습니다.");
	}
	int getBalance(){
		return balance;
	}
	String getAccNo(){
		return accNo;
	}
	public int withdraw(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
