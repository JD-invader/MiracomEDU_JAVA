package com.edu.array.algo.test;

import java.util.Scanner;

/*
 * input sample data
 * 6
 * 144453
 */
public class ArrayPersonTypeTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();//배열의 사이즈 :6
		
		int[] people = new int[num];//6칸 사이즈 배열 생성
		for(int i=0; i<people.length;i++) {
			people[i] = sc.nextInt();
		}
		
		//제어문, for문을 사용해서 가장 많은 유형의 타입을 직접 출력
		int[] count = new int[num]; //피플 데이터를 카운팅하여 갯수를 저장하는 배열 생성
		int Cnt=0; //카운팅하는 변수 선언
		int idx=0; //카운트 배열의 인덱스 값을 저장하는 변수 선언
		int Max=count[0]; // 배열의 최대값을 구하는 변수 선언
		
		for(int i=0; i<people.length; i++){ // 이중for문을 사용하여 피플 배열 데이터를 비교
			for(int j=0; j<people.length;j++) { 
				if(people[i]==people[j]) { //비교한 데이터의 중복한 데이터를 카운트하여 카운트 배열에 저장
					Cnt++;
					count[i]=Cnt;
				}
			}
		Cnt=0; //카운트 초기화
		}
		
		for(int i=0; i < count.length; i++) { //카운팅한 배열의 가장 Max값 Search
			if(count[i]>Max) { //Max값의 데이터 갱신 및 인덱스를 저장
				Max = count[i];
				idx=i;
			}
		}
		
		System.out.println("가장 많은 유형의 타입은 :: " + people[idx]); //출력
	}

}
