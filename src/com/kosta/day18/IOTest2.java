package com.kosta.day18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest2 {

	public static void main(String[] args) throws IOException {
		new IOTest2().printScore(".\\src\\com\\kosta\\day18\\data");
	}

	private void printScore(String fileName) throws IOException {
		
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		String str;
		str = br.readLine();
		System.out.println(str.replace("/", "\t") + "\tTotal");
		
		while((str = br.readLine()) != null) {
			int total = 0;
			String[] arr = str.split("/");
			for(int i = 1; i < arr.length; i++) {
				total += Integer.parseInt(arr[i]);
			}
			System.out.println(str.replace("/", "\t") + "\t" + total);
		}
		br.close();
		fr.close();
	} 
}
