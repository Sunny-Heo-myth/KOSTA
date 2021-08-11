package com.kosta.day06.model;

// execute controller's work logic
//
public class MemberService {

	public MemberDTO login(String id, String password) {
		MemberDAO dao = new MemberDAO();
		MemberDTO mem = dao.loginProcess(id, password);
		return mem;
	}
	
	public void logout() {
		
	}
}
