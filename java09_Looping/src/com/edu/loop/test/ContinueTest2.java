package com.edu.loop.test;
/*
 * Looping 주의사항
 * ::
 * break, continue
 * ::
 * break - 반복문을 멈추는 명령어
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
		System.out.println("1부터 10 까지의 홀수의 합은 " + total);

	}

}
