package com.kosta.Test;

class Prob3 {
	public static void main(String args[]){
		PhoneCharge skt = new PhoneCharge("������", 100, 50, 1);
		PhoneCharge ktf = new PhoneCharge("����", 200, 100, 2);
		PhoneCharge lgt = new PhoneCharge("������", 150, 500, 10);
		skt.printCharge();
		ktf.printCharge();
		lgt.printCharge();
	}
}

class PhoneCharge{	
	private String user;//��������̸�
	private int call;//��ȭ�ð�(�д���)
	private int sms;//�������۰Ǽ�
	private int data;//��������ŷ�(GB����)
	private int total;//��ſ��(��)
	
	public PhoneCharge(String user, int call, int sms, int data) {
		super();
		this.user = user;
		this.call = call;
		this.sms = sms;
		this.data = data;
	}
	
	public int calcCharge() {
		int callFee = 0;
		int smsFee = 0;
		int dataFee = 0;
		this.total = 0;
		
		if(call < 200) {
			callFee += 10 * call;
		}else {
			callFee += 20 * call;
		}
		
		if(sms < 300) {
			smsFee += 20 * sms;
		}else {
			smsFee += 80 * sms;
		}
		
		if(data < 7) {
			dataFee += 1000 * data;
		}else {
			dataFee += 2000 * data;
		}
		
		total = callFee + smsFee + dataFee;
		return total;
	}

	public void printCharge() {
		System.out.println(this.user + " ����ڴ� �̹��޿� ����Ͻ� ��ȭ����� " + this.calcCharge() + " ���Դϴ�.");
	}
}
 