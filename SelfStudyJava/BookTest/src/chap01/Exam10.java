package chap01;

import java.util.Scanner;
//���� �������� �ڸ����� ���Ͽ� ��Ÿ��
public class Exam10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� �ڸ����� ���մϴ�.");
		int num;
		do {
			System.out.println("���� ��:");
			num = sc.nextInt();
		}while(num<=0);
		
		int no=0; // �ڸ���
		while(num>0) {
			num/=10;
			no++;
		}
		
		System.out.println("�� ���� " + no + "�ڸ��Դϴ�.");
	}

}
