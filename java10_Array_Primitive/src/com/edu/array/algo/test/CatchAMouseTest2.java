package com.edu.array.algo.test;

import java.util.Scanner;

public class CatchAMouseTest2 {
	private static String solve(int cata, int catb, int mouse) {
		String R="";
		
		//CatA와 CatB의 Mouse와의 거리를 각각 계산하여 저장
		int cal1 = mouse - cata;
		int cal2 = mouse - catb;
		
		//저장된 값을 절대값으로 변환
		Math.abs(cal1);
		Math.abs(cal2);
		
		//절대값으로 변환된 데이터의 차이를 결과 변수에 저장
		int result = Math.abs(cal1)-Math.abs(cal2);
		
		//비교한 결과를 문자열 변수에 저장
		if(result<0) {
			R = "CatA Catch!";
			System.out.println(R);
		}
		if(result>0) {
			R = "CatB Catch!";
			System.out.println(R);
		}
		if(result==0) {
			R = "Mouse Escape!";
			System.out.println(R);
		}
		
		return R; //결과 리턴
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//값을 순서대로 3개 catA, catB, Mouse
		int cata = sc.nextInt();
		int catb = sc.nextInt();
		int mouse = sc.nextInt();
		
		String result=solve(cata, catb, mouse);
		//System.out.println(result);
	}

}
