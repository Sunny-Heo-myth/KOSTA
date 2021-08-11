package com.kosta.day06;

public class MemberController {

	public static void main(String[] args) {
		
		MemberService service = new MemberService();
		boolean ret = service.login("Hong", "12345");
		
		if(ret == true) {
			System.out.println("Login succeed!");
		}
	
	}
}
