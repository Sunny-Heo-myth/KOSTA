package com.kosta.day18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest {

	public static void main(String[] args) throws IOException {
		f1();
		
	}

	private static void f1() throws IOException {
		InputStream is = System.in;
		// 1 Byte read
		InputStreamReader ir = new InputStreamReader(is); 
		int data;
		while((data = ir.read()) != -1){
			System.out.println((char)data);
		}
	}

}
