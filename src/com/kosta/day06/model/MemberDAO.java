package com.kosta.day06.model;

public class MemberDAO {

	// 1. login id, pass receive member info return
	MemberDTO loginProcess(String id, String password) {
		
		MemberDTO member = null;
		if(id.equals("admin") && password.equals("1234")) {
			member = new MemberDTO("hong", id, password, 20);
		}else {
		}
		return member;
	}
}
