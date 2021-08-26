package com.kosta.day15;

public class Product<A, B, C> {
	A kind;
	B model;
	C color;
	
	public Product() {
		super();
	}

	public Product(A kind, B model, C color) {
		super();
		this.kind = kind;
		this.model = model;
		this.color = color;
	}

	public final A getKind() {
		return kind;
	}

	public final B getModel() {
		return model;
	}

	public final C getColor() {
		return color;
	}

	public final void setKind(A kind) {
		this.kind = kind;
	}

	public final void setModel(B model) {
		this.model = model;
	}

	public final void setColor(C color) {
		this.color = color;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [kind=").append(kind).append(", model=").append(model).append(", color=").append(color)
				.append("]");
		return builder.toString();
	}
	
	
}
