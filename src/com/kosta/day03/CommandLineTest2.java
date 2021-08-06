package com.kosta.day03;

public class CommandLineTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("wrong!");
			System.exit(0);
		}
		System.out.println(args[0] + args[1]);
	}

}
