package com.kosta.day03;

public class GCDTest {

	public static void main(String[] args) {
		// 최대공약수 : 두수 모두 나누어 떨어지는 수중에 가장큰거
		// (5,15)==>5
		//5 ->1,5
		//15->1,3,5,15
		//1.두수중에 작은수를 찾는다.
		//2.작은수~1 까지의 수로 두수를 나누어본다. 나누어떨어지면 중단 
		int su1 = 5;
		int su2 = 15;
		int min = su1>su2?su2:su1;
		//System.out.println("작은수는 " + min);
		
		for(int i=min; i>=1; i--) {
			if(su1%i==0 && su2%i==0) {
				System.out.println("최대공약수는 " + i);
				break;
			}
		}
		
	}

}
