package com.edu.array.test;
public class BasicArrayTest2 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		//3.�ʱ�ȭ
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		//length�� �迭�� ����� �����ϴ� �ʵ��̴�. =>int��ȯ
		for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
		
		System.out.println("���� ��ü�� �����ϴ� �ּҰ� ::"+arr);
	}

}
