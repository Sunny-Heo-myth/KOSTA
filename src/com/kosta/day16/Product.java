package com.kosta.day16;

public class Product <T, M>{
	
	T kind;
	M model;
	
	public final T getKind() {
		return kind;
	}
	public final M getModel() {
		return model;
	}
	public final void setKind(T kind) {
		this.kind = kind;
	}
	public final void setModel(M model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [kind=").append(kind).append(", model=").append(model).append("]");
		return builder.toString();
	}
	
	
}
