package com.edu.loop.test;
/*
 * Looping�� / �ݺ���
 * ::
 * for, while
 * ::
 * ���� ������ �����ϴ� ���ȿ��� 
 * �ڵ����� �ݺ������� �����ϴ� ����
 * ::
 * <Syntax>
 * for(initialization(�ʱ�ȭ��); boolean expression(���ǽ�); update(������Ʈ��)){
 *  // CodeBlock
 * }
 * 
 * <Syntax>
 * while(boolean expression(���ǽ�); update(������Ʈ��)){
 *  // CodeBlock
 * }
 * 
 */
public class BasicLoopTest1 {

	public static void main(String[] args) {
		
		System.out.println("========for=============\n");
		
		/*
		for(int i=0; i<10; i++) System.out.println("for....."+i);
		
		for(int i=0, j=1; i<=10 & j<=10; i++, j++ ) System.out.println(i+"...for loop...");
		*/
		
		System.out.println("========while==========\n");
		
		int i = 10;
		while(i>0) {
			System.out.println("while..."+i);
			i--;
		}
		
		
	}

}
