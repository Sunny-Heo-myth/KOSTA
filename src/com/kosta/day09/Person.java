package com.kosta.day09;

//class = field + method, 설계도 
//실체(object, instance), a=new Person("홍길동", 20);b=new Person();c=new Person("박")
//this() : 자신의 다른모양의 생성자호출 
//super() : 부모의 생성자를 호출 

//abstract  class : abstract method가 있다. 
//객체 직접 생성불가 (new)
public abstract  class Person extends Object {
	private String name;
	private int age;
	static int count;

	{
		System.out.println("instance block");
	}
	static {
		System.out.println("static block");
	}
	public Person() {
		this(null, 0);
		System.out.println("aaaaa");
	}

	public Person(String name) {
		this(name, 10);
	}

	public Person(String name, int age) {
		super();// Object()....부모가 먼저생성, 자식이 나중에 생성
		this.name = name;
		this.age = age;
		count++;
		System.out.println(count + "번째 person생성");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}
	void display() {
		System.out.println("parent method");
	}
	
	//abstract메서드 : 정의(method선언부)있고 구현{}없다. 
	abstract void work() ;
}







