package com.kosta.day15;

public class Box<T> {
	T data;

	public Box() {
		super();
	}

	public Box(T data) {
		super();
		this.data = data;
	}

	public final Object getData() {
		return data;
	}

	@SuppressWarnings("unchecked")
	public final void setData(Object data) {
		this.data = (T) data;
	}
	
	
}
