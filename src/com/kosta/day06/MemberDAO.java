package com.kosta.day06;

// Go to DB, return data.
public class MemberDAO {
	
	boolean loginProcess(String id, String password) {
		//controller -> service -> DAO -> DB
		if(id.equals("admin") && password.equals("1234")) {
			return true;
		}else {
			return false;
		}
	}
	
	void logoutProcess(String id) {
		System.out.println(id + " bye.");
	}

}
