package com.edu.loop.test;
/*
 * Looping ���ǻ���
 * ::
 * break, continue
 * ::
 * break - �ݺ����� ���ߴ� ��ɾ�
 * contunue - 
 * ::
 * <Syntax>
 * }
 * 
 */
public class ContinueTest2 {

	public static void main(String[] args) {
		int total = 0;
		
		for(int num = 1; num <= 10; num++) {
			if(num%2==0) continue;
			total += num;
		}
		System.out.println("1���� 10 ������ Ȧ���� ���� " + total);

	}

}
