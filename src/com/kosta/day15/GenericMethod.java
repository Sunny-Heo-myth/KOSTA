package com.kosta.day15;

public class GenericMethod {

	public <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		return box;
	}
	
	public <A, B, C> Product<A, B, C> transfer(A a, B b, C c){
		Product<A, B, C> p1 = new Product<A, B, C>(a, b, c);
		return p1;
	}
}
