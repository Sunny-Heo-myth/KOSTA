package com.kosta.day09;

//class = field + method, ���赵 
//��ü(object, instance), a=new Person("ȫ�浿", 20);b=new Person();c=new Person("��")
//this() : �ڽ��� �ٸ������ ������ȣ�� 
//super() : �θ��� �����ڸ� ȣ�� 

//abstract  class : abstract method�� �ִ�. 
//��ü ���� �����Ұ� (new)
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
		super();// Object()....�θ� ��������, �ڽ��� ���߿� ����
		this.name = name;
		this.age = age;
		count++;
		System.out.println(count + "��° person����");
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
	
	//abstract�޼��� : ����(method�����)�ְ� ����{}����. 
	abstract void work() ;
}







