package com.edu.array.algo.test;

public class ArrayMaxAndMinTest1 {

	public static void main(String[] args) {
		int[] scores = {79,88,91,44,100,55,95};
		
		//scores �ȿ� ���� �߿��� ���� ���� ������ ���� ������ ������ ã�Ƽ� ���
		
		int min = scores[0];
		int MAX = scores[0];
		
		//for���� if ���� ����ؼ� ������ �ۼ�
		for(int i=0; i < scores.length; i++) {
			if(scores[i]<min) min = scores[i];
			if(scores[i]>MAX) MAX = scores[i];
		}
		
		System.out.println("�ִ밪::"+MAX);
		System.out.println("�ּҰ�::"+min);
		
	}

}
