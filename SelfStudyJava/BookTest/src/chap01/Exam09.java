package chap01;

import java.util.Scanner;

/*
 * ���� a, b�� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ��ȯ�ϴ� �޼��� �ۼ�
 */
public class Exam09 {
	static int sumof(int a,int b) {
		int min;
		int max;
		
		if(a<b) {
			min =a;
			max = b;
		}else {
			min=b;
			max=a;
		}
		int sum =0;
		for(int i=min;i<=max;i++)
			sum+=i;
		return (sum); 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a�� b�� �����Ͽ� �� ������ ��� ������ ���� ���մϴ�.");
		System.out.print("a�� ����");
		int a = sc.nextInt();
		System.out.print("b�� ����");
		int b = sc.nextInt();
		System.out.println("���� a, b ������ ��� ������ ���� "+sumof(a,b)+"�Դϴ�.");
		
	}

}
