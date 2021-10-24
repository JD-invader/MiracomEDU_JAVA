package com.edu.loop.test;
/*
 * Looping문 / 반복문
 * ::
 * for, while
 * ::
 * 참인 조건을 만족하는 동안에만 
 * 코드블락을 반복적으로 수행하는 문장
 * ::
 * <Syntax>
 * for(initialization(초기화식); boolean expression(조건식); update(업데이트식)){
 *  // CodeBlock
 * }
 * 
 * <Syntax>
 * while(boolean expression(조건식); update(업데이트식)){
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
