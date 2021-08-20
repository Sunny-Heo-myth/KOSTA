package com.kosta.day12;

import java.util.Arrays;

public class Member implements Cloneable{

	public String name;
	int age;
	int[] scores;
	Book book;
	
	public Member(String name, int age, int[] scores, Book book) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.book = book;
	}

	// Deep copy
	@Override
	protected Object clone() throws CloneNotSupportedException {

		Member member = (Member)super.clone();
		member.scores = Arrays.copyOf(scores, scores.length);
		member.book = new Book(book.title, book.price);
		return member;
	}
	
	public Member copyMember() {
		Member newMember = null;
		try {
			newMember = (Member)clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newMember;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", scores=" + Arrays.toString(scores) + ", book=" + book + "]";
	}
	
	
	
}
