package com.kosta.day09;

public class Student extends Person {

	String studentNo;
	public Student() {
		this(null, 0, null);
	}
	public Student(String name, int age, String studentNo) {
		super(name, age);
		this.studentNo = studentNo;
	}
	void display() {
		System.out.println("child ������(override) method");
	}
	
	void display(String s) {
		System.out.println(s+"child overloading method");
	}
	@Override
	void work() {
		System.out.println("�ڽ��� �θ��� �߻�޼��� �ݵ�� �����ؾ��Ѵ�.");
		
	}
	
}
