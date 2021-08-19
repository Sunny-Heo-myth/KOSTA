package com.kosta.day11;

public class DiceGame {
	
	public static void main(String args[]){
		
		DiceGame game = new DiceGame ();
		
		int result1 = game.countSameEye(10);
		System.out.println("면의개수가8개인주사위2개를던져서같은눈이나온횟수: " + result1);
		
		int result2 = game.countSameEye(-10);
		System.out.println("면의개수가8개인주사위2개를던져서같은눈이나온횟수: " + result2);
		}
	
		int countSameEye(int n) {
			return 0;
		}
}
