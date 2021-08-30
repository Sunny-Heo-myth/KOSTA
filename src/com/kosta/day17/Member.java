package com.kosta.day17;

public class Member {
	
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
