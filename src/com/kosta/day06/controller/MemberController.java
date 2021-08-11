package com.kosta.day06.controller;

import java.util.Scanner;

import com.kosta.day06.MemberService;
import com.kosta.day06.model.MemberDTO;
import com.kosta.day06.view.MemberView;

public class MemberController {

	public static void main(String[] args) {
		
		MemberService service = new MemberService();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Login 2. Logout");
			System.out.println("Work? >>");
			int selectNo = sc.nextInt();
			if(selectNo == 1) {
				System.out.println("id : ");
				String id = sc.next();
				System.out.println("pw : ");
				String password = sc.next();
				MemberDTO member = service.login(id, password);
				MemberView.display(member);
			}else if(selectNo == 2) {
				String message = service.logout(member);
				MemberView.display(member);
			}else {
				System.out.println("Wrong number!");
			}
		}
		

	}

}
