package com.kosta.Test;

class Prob3 {
	public static void main(String args[]){
		PhoneCharge skt = new PhoneCharge("김현우", 100, 50, 1);
		PhoneCharge ktf = new PhoneCharge("신희만", 200, 100, 2);
		PhoneCharge lgt = new PhoneCharge("조유성", 150, 500, 10);
		skt.printCharge();
		ktf.printCharge();
		lgt.printCharge();
	}
}

class PhoneCharge{	
	private String user;//폰사용자이름
	private int call;//통화시간(분단위)
	private int sms;//문자전송건수
	private int data;//데이터통신량(GB단위)
	private int total;//통신요금(원)
	
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
		System.out.println(this.user + " 사용자는 이번달에 사용하신 전화요금이 " + this.calcCharge() + " 원입니다.");
	}
}
 