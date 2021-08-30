package com.kosta.day17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipelinesExample {

	public static void main(String[] args) {
		
		f1();
		f2();
		

	}

	private static void f2() {
		List<Member> list = Arrays.asList(
				new Member("Hong", Member.MALE, 30),
				new Member("Kim", Member.FEMALE, 32),
				new Member("Park", Member.FEMALE, 24),
				new Member("Heo", Member.MALE, 19),
				new Member("Choi", Member.MALE, 40));

		Stream<Member> maleFemaleStream = list.stream();
		Stream<Member> maleStream = maleFemaleStream.filter(m -> m.getSex() == Member.MALE);
		
	}

	private static void f1() {
		
		
	}

}
