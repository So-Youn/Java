package Beakjoon.step06;

import java.util.Scanner;

public class Test2562 {
/*	9���� ���� �ٸ� �ڿ����� �־��� ��, 
 *  �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� 
 *  ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int index = 0;
		
		for (int i=1;i<=9;i++) {
			int num = sc.nextInt();
			if(num > max) {
				max = num;
				index = i ; 
			}
		}
		System.out.println(max);
		System.out.println(index);
		
		
	}

}
