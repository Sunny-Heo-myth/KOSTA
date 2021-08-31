package com.kosta.day18;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, String> location = new HashMap<String, String>();
		location.put("home", "Daejeon");
		location.put("office", "Seoul");
		
		for(String key : location.keySet()){
		   
			System.out.println(key + " " + location.get(key));
		}


	}

}
