package chap01;

import java.util.Scanner;

public class SumDowhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n ;
		System.out.println("1���� n������ �������մϴ�.");
		do {
			System.out.println("n�� :");
			n=sc.nextInt();
			//n�� 0���� Ŭ ������ �ݺ�
		}while(n<=0);
		//n�� 0 ������ ���� ������ �ٽ� 'n�� ��:' ���� �Է� �䱸
		int sum = 0;
		for (int i=1;i<=n;i++)
			sum+=i;
		
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}

}
