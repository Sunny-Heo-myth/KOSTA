package com.kosta.day06;

public class MemberService {

	MemberDAO dao = new MemberDAO();
	
	public boolean login(String id, String password) {
		boolean result = dao.loginProcess(id, password);
		System.out.println((result == true)?"success!" : "fail");
		MemberVO member = null;
		return result;
	}
	
	public void logout(String id) {
		dao.logoutProcess(id);
	}
}
