package com.kosta.day16;

public class Address {

	String country;
	String city;
	
	public Address(String country, String city) {
		super();
		this.country = country;
		this.city = city;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [country=").append(country).append(", city=").append(city).append("]");
		return builder.toString();
	}

	
}
