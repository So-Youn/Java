package Beakjoon.step08;

import java.util.Scanner;
//���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, 
//�־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class Test11654 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		
		int charnum = num.charAt(0); //�Է� ���� ���� char-> int ������ ����
		//charAt() : Returns the char value at the specified index.
		System.out.println(charnum);
	}

}
