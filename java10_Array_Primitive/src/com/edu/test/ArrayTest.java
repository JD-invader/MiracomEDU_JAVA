package com.edu.test;

import java.util.Arrays;

public class ArrayTest {
	
	static int totVal=0;
	//static int Ave=0;
	//static int minVal=0;
	
	static int[] list = { 34, 23, 64, 25, 12, 75, 22, 88, 53, 37 };
	
	static void print() {
		for(int i : list) {
			System.out.print(i+" ");
		}
	}
	
	static void total() {
		int tot=0;
		for(int i : list) {
			tot=tot+i;
		}
		totVal=tot;
		System.out.println("\n배열의 합 :: "+tot);
	}		
	
	static void average() {
		int Ave=totVal/list.length;
		System.out.println("배열의 평균 :: "+Ave);
	}	
	
	static void minimum() {  
		
		int min=list[0];
		for(int i : list) {
			if(i<min) min=i;
		}
		System.out.println("배열의 최소값 :: "+min);
	}
	
	static void sorting() {
		Arrays.sort(list);
		System.out.println("=== Selection sort (Ascending Order)===");
		for(int i : list)
		System.out.print(i+" ");
	}
	public static void main(String[] args) {		
		print();
		total();
		average();
		minimum();
		sorting();
	}

}
