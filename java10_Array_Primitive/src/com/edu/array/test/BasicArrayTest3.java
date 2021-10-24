package com.edu.array.test;
public class BasicArrayTest3 {

	public static void main(String[] args) {
		
		int[] arr = {11,22,33};
		int[] arr2 = {1,2,3};
		//length는 배열의 사이즈를 리턴하는 필드이다. =>int반환
		for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
		
		System.out.println("베열 객체를 참조하는 주소값 ::"+arr);
		
		System.out.println("\n=================\n");
		
		//추가... 메모리에서 어떤일이 벌어지는지를 잘 생각해보시기 바랍니다.
		//가능하다면 직접 그림
		
		
		arr2=arr;
		for(int i=0; i<arr2.length; i++) System.out.print(arr2[i]+" ");
		
		//toString()기능: 주소값을 문자열로 리턴하는 기능
		System.out.println("베열 객체를 참조하는 주소값 ::"+arr2.toString());

	}

}
