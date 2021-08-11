package com.kosta.day06;

public class MemberVO {
	private String name;
	private String id;
	private String passward;
	private int age;
	
	public MemberVO() {}
	
	public MemberVO(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}



	public MemberVO(String name, String id, String passward, int age) {
		super();
		this.name = name;
		this.id = id;
		this.passward = passward;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", id=" + id + ", passward=" + passward + ", age=" + age + "]";
	}
	
}
