package com.kosta.day11;

public class DiceGame {
	
	public static void main(String args[]){
		
		DiceGame game = new DiceGame ();
		
		int result1 = game.countSameEye(10);
		System.out.println("���ǰ�����8�����ֻ���2�����������������̳���Ƚ��: " + result1);
		
		int result2 = game.countSameEye(-10);
		System.out.println("���ǰ�����8�����ֻ���2�����������������̳���Ƚ��: " + result2);
		}
	
		int countSameEye(int n) {
			return 0;
		}
}
