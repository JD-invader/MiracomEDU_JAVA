package com.edu.array.test;
public class BasicArrayTest3 {

	public static void main(String[] args) {
		
		int[] arr = {11,22,33};
		int[] arr2 = {1,2,3};
		//length�� �迭�� ����� �����ϴ� �ʵ��̴�. =>int��ȯ
		for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
		
		System.out.println("���� ��ü�� �����ϴ� �ּҰ� ::"+arr);
		
		System.out.println("\n=================\n");
		
		//�߰�... �޸𸮿��� ����� ������������ �� �����غ��ñ� �ٶ��ϴ�.
		//�����ϴٸ� ���� �׸�
		
		
		arr2=arr;
		for(int i=0; i<arr2.length; i++) System.out.print(arr2[i]+" ");
		
		//toString()���: �ּҰ��� ���ڿ��� �����ϴ� ���
		System.out.println("���� ��ü�� �����ϴ� �ּҰ� ::"+arr2.toString());

	}

}
