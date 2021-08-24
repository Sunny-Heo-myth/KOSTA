package com.kosta.day13;

public class Tire implements Comparable<Tire>{

	private String company;
	private String color;
	
	public Tire(String company, String color) {
		super();
		this.company = company;
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public String getColor() {
		return color;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int compareTo(Tire obj) {
		// TODO Auto-generated method stub
		return company.compareTo(obj.company);
	}
	
	
}
