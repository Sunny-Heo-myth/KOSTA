package com.kosta.day12;

public class StringComparator {

	public static void main(String[] args) {
		System.out.println("======= Quiz 1 =======");
		StringComparator sc = new StringComparator();
		int result1 = sc.compare("Yongari-2001", "DragonWar", true);
		int result2 = sc.compare("Yongari-2001", "DragonWar", false);	 
		System.out.println(result1);//12
		System.out.println(result2);//9 
		
		System.out.println("======= Quiz 2 =======");
		String s  = "Boys, be ambitious.";
		System.out.println(FindCharacters.countChar(s, 'i'));
		System.out.println(FindCharacters.countChar(s, 'b'));
	  
		System.out.println("======= Quiz 3 =======");
		String[] str = {"SuperMan", "BatMan", "SpiderMan"};
		System.out.println(StringUtil.concatenate(str));
	}
	
	int compare(String str1, String str2, boolean isLength) {
		
		if(isLength == true) {
			if(str1.length() >= str2.length()) {
				return str1.length();
			}else {
				return str2.length();
			}
			
		}else {
			int cnt1 = 0; int cnt2 = 0;
			for(char i : str1.toCharArray()) {
				if(i == 'a') {
					cnt1++;
				}
			}
			for(char i : str2.toCharArray()) {
				if(i == 'a') {
					cnt2++;
				}
			}
			if(cnt1 >= cnt2) {
				return str1.length();
			}else {
				return str2.length();
			}
		}
		
	}
}
