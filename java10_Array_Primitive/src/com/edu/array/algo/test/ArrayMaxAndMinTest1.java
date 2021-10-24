package com.edu.array.algo.test;

public class ArrayMaxAndMinTest1 {

	public static void main(String[] args) {
		int[] scores = {79,88,91,44,100,55,95};
		
		//scores 안에 점수 중에서 가장 잘한 성적과 가장 못받은 성적을 찾아서 출력
		
		int min = scores[0];
		int MAX = scores[0];
		
		//for문과 if 문을 사용해서 로직을 작성
		for(int i=0; i < scores.length; i++) {
			if(scores[i]<min) min = scores[i];
			if(scores[i]>MAX) MAX = scores[i];
		}
		
		System.out.println("최대값::"+MAX);
		System.out.println("최소값::"+min);
		
	}

}
