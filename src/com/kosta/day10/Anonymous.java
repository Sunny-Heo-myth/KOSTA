package com.kosta.day10;

public class Anonymous {

	Person field = new Person() {
		void work() {
			System.out.println("work!");
		}
		
		@Override
		void wake() {
			System.out.println("wake up at 6.");
			work();
		}
	};
	
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("take a walk.");
			}
			
			@Override
			void wake() {
				System.out.println("wake up at 5.");
				walk();
			}
		};
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}

}
