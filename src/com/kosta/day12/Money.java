package com.kosta.day12;

public class Money {

	int amount;

	public Money(int amount) {
		super();
		this.amount = amount;
	}
	
	Money add(Money money) {
		return new Money(this.amount + money.amount);
	}
	
	Money minus(Money money) {
		return new Money(this.amount - money.amount);
	}
	
	Money multiply(Money money) {
		return new Money(this.amount * money.amount);
	}
	
	Money devide(Money money) {
		return new Money(this.amount / money.amount);
	}
	
	@Override
	public boolean equals(Object object) {
		if(object instanceof Money) {
			Money money = (Money)object;
			return (this.amount == money.amount)? true : false;
		}else {
			return false;
		}
		
	}
}
