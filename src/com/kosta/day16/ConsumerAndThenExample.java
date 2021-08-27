package com.kosta.day16;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class ConsumerAndThenExample {

		public static void main(String[] args) {
			
			f3();
			
		}

		private static void f3() {
			IntPredicate aa = (x) -> x%2 == 0;
			IntPredicate bb = (x) -> x%3 == 0;
			
		}

		private static void f2() {
			Function<Member, Address> functionA;
			Function<Address, String> functionB;
			Function<Member, String> functionC;
			
			functionA = (member) -> member.address;
			functionB = (address) -> address.city;
			functionC = functionA.andThen(functionB);
			
		}

		private static void f1() {
			Consumer<Member> a = (m) -> {
				System.out.println(m.name);
			};
			
			Consumer<Member> b = (m) -> {
				System.out.println(m.id);
			};
			
			Consumer<Member> c = a.andThen(b);
			
			c.accept(new Member("Kim", "123", null));
			
		}
}
