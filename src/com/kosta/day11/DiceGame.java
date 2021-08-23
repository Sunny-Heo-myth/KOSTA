package com.kosta.day11;

public class DiceGame {
	
	public static void main(String args[]) throws IllegalArgumentException {
		
		DiceGame game = new DiceGame ();
		
		int result1 = game.countSameEye(10);
		System.out.println("���ǰ�����8�����ֻ���2�����������������̳���Ƚ��: " + result1);
		
		int result2 = game.countSameEye(-10);
		System.out.println("���ǰ�����8�����ֻ���2�����������������̳���Ƚ��: " + result2);
	}
	
	int countSameEye(int n) throws IllegalArgumentException {
		if(n < 0) {
			throw new IllegalArgumentException(null);
		}
		int sameCount = 0;
		Dice diceA = new Dice(8);
		Dice diceB = new Dice(8);
		for(int count = 0; count < n; count++) {
			int outputA = diceA.play();
			int outputB = diceB.play();
			if(outputA == outputB) {
				sameCount++;
			}
		}
		return sameCount;
	}
}
