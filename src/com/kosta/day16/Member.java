package com.kosta.day16;

public class Member {

	String name;
	String id;
	Address address;
	
	public Member(String name, String id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [name=").append(name).append(", id=").append(id).append(", address=").append(address)
				.append("]");
		return builder.toString();
	}
	
}
