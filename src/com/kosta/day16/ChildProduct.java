package com.kosta.day16;

public class ChildProduct<T, M, C> extends Product<T, M>{

	C company;

	public final C getCompany() {
		return company;
	}
	public final void setCompany(C company) {
		this.company = company;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChildProduct [company=").append(company).append("]");
		return builder.toString();
	}
	
	
}
