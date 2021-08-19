package com.kosta.day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		call();

	}

	private static void call() {
		FileReader fr = null;
		int i;
		
		try {
			fr = new FileReader("C:/KOSTA/JavaProject/src/com/kosta/day11/EnumTest3.java");
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(fr != null) fr.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


}
