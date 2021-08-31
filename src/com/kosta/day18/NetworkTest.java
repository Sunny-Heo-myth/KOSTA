package com.kosta.day18;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkTest {

	public static void main(String[] args) throws UnknownHostException {
		f1();

	}

	private static void f1() throws UnknownHostException {
		InetAddress ia = InetAddress.getLocalHost();
		System.out.println(ia.getHostAddress());
		System.out.println(ia.getHostName());
		
	}

}
