package com.kosta.day12;

public class MemberExample {

	public static void main(String[] args) {
		int[] scores = {90, 100, 95};
		Book b= new Book("Java", 30000);
		Member m1 = new Member("hong", 20, scores, b);
		System.out.println(m1);
		
		Member m2 = m1.copyMember();
		m2.name = "yo";
		m2.scores[2] = 0;
		System.out.println(m2);

	}

}
