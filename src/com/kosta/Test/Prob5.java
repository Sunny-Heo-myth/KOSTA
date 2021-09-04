package com.kosta.Test;

public class Prob5 {
	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		for(int j = 0; j < counter.length; j++) {
			for(int i : answer) {
				if(i == j + 1) {
					counter[j] += 1;
				}
			}
		}

		for(int j = 0; j < counter.length; j++) {
			System.out.println((j+1) + "의 갯수는 " + counter[j] + "개 입니다.");
		}
		
		// 구현하시오 - 출력결과와 같이 나오도록 작성한다.
		
		
		

	}
}
