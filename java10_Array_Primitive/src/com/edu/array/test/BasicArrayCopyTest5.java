package com.edu.array.test;
/*
 * �迭�� ������ �ִ� �߿��� ����
 * 
 * �ٸ� ����� ���� �迭�� ������ Copy�� �� ���� �ִ�.
 * system.arraycopy()
 */
public class BasicArrayCopyTest5 {

	public static void main(String[] args) {
		int[] target = {1,2,3,4,5,6};
		int[] source = {10,9,8,7,6,5,4,3,2,1};
		
		//target ������ ��� ::8 7 6 5 4 3
		//system.arraycopy();
		//for ����ؼ� target���� �����͸� ��� �޾Ƽ� Ȯ��
		
		System.arraycopy(source, 2, target, 0, target.length);
		
		for(int i : target) System.out.print(i+" ");
	}

}
