package com.edu.array.test;
public class BasicArrayTest2 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		//3.초기화
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		//length는 배열의 사이즈를 리턴하는 필드이다. =>int반환
		for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
		
		System.out.println("베열 객체를 참조하는 주소값 ::"+arr);
	}

}
