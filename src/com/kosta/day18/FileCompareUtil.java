package com.kosta.day18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileCompareUtil {

	public static void main(String[] args) throws IOException {
		
		String f1 = ".\\src\\com\\kosta\\day18\\first.txt";
		String f2 = ".\\src\\com\\kosta\\day18\\second.txt";
		ArrayList<String> alist = new FileCompareUtil().compareFile(f1, f2);
		alist.stream().forEach(System.out::println);
	}

	private ArrayList<String> compareFile(String firstFileName, String secondFileName) throws IOException {
		ArrayList<String> alist = new ArrayList<String>();
		FileReader fr1 = new FileReader(firstFileName);
		FileReader fr2 = new FileReader(secondFileName);
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		String str1; String str2 = null;
		int line = 0;
		
		while(true) {
			str1 = br1.readLine();
			str1 = br2.readLine();
			if(str1==null) break;
			line++;
			if(!str1.equals(str2)) alist.add("LINE " + line + ":" + str2);
		}
		
		br1.close();br2.close();fr1.close();fr2.close();
		return alist;
		
		
	}

}
