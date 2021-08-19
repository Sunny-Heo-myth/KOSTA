package com.kosta.day11;

public class OuterClass {

	private String empId;
	private String empName;
	private static String company;
	private static final boolean KIND = true;
	
	public OuterClass(String empId, String empName, String company) {
		super();
		this.empId = empId;
		this.empName = empName;
		OuterClass.company = company;	
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public static String getCompany() {
		return company;
	}

	public static boolean isKind() {
		return KIND;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public static void setCompany(String company) {
		OuterClass.company = company;
	}
	
	class InnerClassA{
		int a = 10;
		void f1() {}	
	}
	
	static class InnerClassB{
		int a = 10;
		static int b = 11; 
		void f1() {}	
		static void f2() {}
	}
	
	void f1() {
		class LocalClass{
			
		}
	}
	
}
