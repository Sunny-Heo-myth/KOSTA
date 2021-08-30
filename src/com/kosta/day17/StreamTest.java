package com.kosta.day17;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StreamTest {
	static List<Integer> IntegerList = new LinkedList<>();
	static {
 		IntegerList.add(3);
 		IntegerList.add(3);
 		IntegerList.add(3);
 		IntegerList.add(3);
 		IntegerList.add(5);
 		
	}
	
	public static void main(String[] args) {
		f2();
	}

	private static void f2() {
		IntegerList.stream().forEach(Int -> System.out.println(Int));
		
	}

	private static void f1() {
		
 		Iterator<Integer> iter = IntegerList.iterator();
 		while(iter.hasNext()) {
 			Integer name = iter.next();
 			System.out.println(name);
 		}
	}

}
