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
			System.out.println((j+1) + "�� ������ " + counter[j] + "�� �Դϴ�.");
		}
		
		// �����Ͻÿ� - ��°���� ���� �������� �ۼ��Ѵ�.
		
		
		

	}
}
