package chap01;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a�� ��:");
		int a = sc.nextInt();
		
		int b;
		
		while(true) {
			System.out.print("b�� ����");
			b = sc.nextInt();
			if(b>a)
				break;
			System.out.println("a���� ū ���� �Է��ϼ���!");
		}
		
		System.out.println("b - a�� " + (b - a) + "�Դϴ�.");
		
	}

}
