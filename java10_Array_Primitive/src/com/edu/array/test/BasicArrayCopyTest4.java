package com.edu.array.test;
/*
 * 배열이 가지고 있는 중요한 성질
 * 배열은 resizing이 안된다
 * 한번 만든 배열 객체를 가지고 사이즈를 수정하게 되면 새로운 객체가 만들어진다.
 * 
 * 다른 사이즈를 가진 배열의 내용을 Copy해 올 수는 있다.
 * system.arraycopy()
 */
public class BasicArrayCopyTest4 {

	public static void main(String[] args) {
		int[] target = {1,2,3,4,5,6};
		
		for(int i =0 ; i<target.length;i++) System.out.println(target[i]+" ");
		
		//향상된 for문, for in "뭐가 어디서 돌아가나?"
		for(int i : target) System.out.println(i+" ");
		
		target = new int[10]; //칸 증가 6->10
		target[6]=11;
		target[7]=22;
		target[8]=33;
		target[9]=44;
		
		for(int i : target) System.out.println(i+" ");
	}

}
