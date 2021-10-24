package com.edu.array.test;
/*
 * Array란?
 * 같은 데이터 타입을 가지는 서로다른 값들을 하나의 변수로 처리하는 것
 * 
 * Array 선언, 생성, 초기화
 * 1.선언 : int[ ] arr;
 * 2.생성 : arr = new int[ ];(반드시 사이즈를 명시)
 * 3.초기화 : arr[0]=##; arr[1]=##; ......
 */
public class BasicArrayTest1 {

	public static void main(String[] args) {
		//1.배열 선언
		int[] arr;
		
		//2.배열생성
		arr = new int[3];
		
		//3.초기화
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		//length는 배열의 사이즈를 리턴하는 필드이다. =>int반환
		for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
		
		System.out.println("베열 객체를 참조하는 주소값 ::"+arr);
	}

}
