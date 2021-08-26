package com.kosta.day15;

public class Account {
	
	private String accNo;
	private int balance;
	public Account(String accNo) {
		this.accNo = accNo;
		myPrint("���°� �����Ǿ����ϴ�.");
	}
	//�Լ��� ����� ������ ����
	void myPrint(String msg) {
		System.out.println(getAccNo() + msg);
		System.out.println(accNo + "������ �ܰ� " + getBalance() + "�����Դϴ�.");
	}
	
	public void save(int amount) {
		balance += amount;
		myPrint(amount + "������ �ԱݵǾ����ϴ�.");
	}
	public void deposit(int amount) {
		balance -= amount;
		myPrint(amount + "������ ��ݵǾ����ϴ�.");
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
