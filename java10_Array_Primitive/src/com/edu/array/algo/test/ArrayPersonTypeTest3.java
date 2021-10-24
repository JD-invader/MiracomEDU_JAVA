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
		int num = sc.nextInt();//�迭�� ������ :6
		
		int[] people = new int[num];//6ĭ ������ �迭 ����
		for(int i=0; i<people.length;i++) {
			people[i] = sc.nextInt();
		}
		
		//���, for���� ����ؼ� ���� ���� ������ Ÿ���� ���� ���
		int[] count = new int[num]; //���� �����͸� ī�����Ͽ� ������ �����ϴ� �迭 ����
		int Cnt=0; //ī�����ϴ� ���� ����
		int idx=0; //ī��Ʈ �迭�� �ε��� ���� �����ϴ� ���� ����
		int Max=count[0]; // �迭�� �ִ밪�� ���ϴ� ���� ����
		
		for(int i=0; i<people.length; i++){ // ����for���� ����Ͽ� ���� �迭 �����͸� ��
			for(int j=0; j<people.length;j++) { 
				if(people[i]==people[j]) { //���� �������� �ߺ��� �����͸� ī��Ʈ�Ͽ� ī��Ʈ �迭�� ����
					Cnt++;
					count[i]=Cnt;
				}
			}
		Cnt=0; //ī��Ʈ �ʱ�ȭ
		}
		
		for(int i=0; i < count.length; i++) { //ī������ �迭�� ���� Max�� Search
			if(count[i]>Max) { //Max���� ������ ���� �� �ε����� ����
				Max = count[i];
				idx=i;
			}
		}
		
		System.out.println("���� ���� ������ Ÿ���� :: " + people[idx]); //���
	}

}
