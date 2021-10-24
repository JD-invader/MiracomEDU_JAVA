package com.edu.array.test;
/*
 * �迭�� ������ �ִ� �߿��� ����
 * �迭�� resizing�� �ȵȴ�
 * �ѹ� ���� �迭 ��ü�� ������ ����� �����ϰ� �Ǹ� ���ο� ��ü�� ���������.
 * 
 * �ٸ� ����� ���� �迭�� ������ Copy�� �� ���� �ִ�.
 * system.arraycopy()
 */
public class BasicArrayCopyTest4 {

	public static void main(String[] args) {
		int[] target = {1,2,3,4,5,6};
		
		for(int i =0 ; i<target.length;i++) System.out.println(target[i]+" ");
		
		//���� for��, for in "���� ��� ���ư���?"
		for(int i : target) System.out.println(i+" ");
		
		target = new int[10]; //ĭ ���� 6->10
		target[6]=11;
		target[7]=22;
		target[8]=33;
		target[9]=44;
		
		for(int i : target) System.out.println(i+" ");
	}

}
