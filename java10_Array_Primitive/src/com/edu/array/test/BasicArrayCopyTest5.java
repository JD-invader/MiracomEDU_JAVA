package com.edu.array.test;
/*
 * 배열이 가지고 있는 중요한 성질
 * 
 * 다른 사이즈를 가진 배열의 내용을 Copy해 올 수는 있다.
 * system.arraycopy()
 */
public class BasicArrayCopyTest5 {

	public static void main(String[] args) {
		int[] target = {1,2,3,4,5,6};
		int[] source = {10,9,8,7,6,5,4,3,2,1};
		
		//target 데이터 결과 ::8 7 6 5 4 3
		//system.arraycopy();
		//for 사용해서 target안의 데이터를 출력 받아서 확인
		
		System.arraycopy(source, 2, target, 0, target.length);
		
		for(int i : target) System.out.print(i+" ");
	}

}
