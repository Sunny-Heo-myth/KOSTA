package com.kosta.day03;

public class GCDTest {

	public static void main(String[] args) {
		// �ִ����� : �μ� ��� ������ �������� ���߿� ����ū��
		// (5,15)==>5
		//5 ->1,5
		//15->1,3,5,15
		//1.�μ��߿� �������� ã�´�.
		//2.������~1 ������ ���� �μ��� �������. ����������� �ߴ� 
		int su1 = 5;
		int su2 = 15;
		int min = su1>su2?su2:su1;
		//System.out.println("�������� " + min);
		
		for(int i=min; i>=1; i--) {
			if(su1%i==0 && su2%i==0) {
				System.out.println("�ִ������� " + i);
				break;
			}
		}
		
	}

}
