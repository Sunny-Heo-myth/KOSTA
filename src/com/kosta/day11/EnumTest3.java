package com.kosta.day11;

public class EnumTest3 {

	public static void main(String[] args) {
		Login_Result[] results = Login_Result.values();
		
		for(Login_Result ret : results) {
			System.out.println(ret + "----" + ret.message);
		}
		
		Login_Result login = Login_Result.LOGIN_SUCCESS;
		if(login == Login_Result.LOGIN_SUCCESS) {
			System.out.println(login.message);
		}
	}

}
