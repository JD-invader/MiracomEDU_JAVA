package com.edu.array.algo.test;

import java.util.Scanner;

public class CatchAMouseTest2 {
	private static String solve(int cata, int catb, int mouse) {
		String R="";
		
		//CatA�� CatB�� Mouse���� �Ÿ��� ���� ����Ͽ� ����
		int cal1 = mouse - cata;
		int cal2 = mouse - catb;
		
		//����� ���� ���밪���� ��ȯ
		Math.abs(cal1);
		Math.abs(cal2);
		
		//���밪���� ��ȯ�� �������� ���̸� ��� ������ ����
		int result = Math.abs(cal1)-Math.abs(cal2);
		
		//���� ����� ���ڿ� ������ ����
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
		
		return R; //��� ����
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���� ������� 3�� catA, catB, Mouse
		int cata = sc.nextInt();
		int catb = sc.nextInt();
		int mouse = sc.nextInt();
		
		String result=solve(cata, catb, mouse);
		//System.out.println(result);
	}

}
