package chap02;

import java.util.Scanner;

public class MaxOfArray {
	// �迭 a�� �ִ��� ���Ͽ� ��ȯ�մϴ�.
	static int maxOf(int[] a) {
		int max = a[0];
		//int[] a = height; ó�� �ʱ�ȭ ��....
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.print("��� �� : ");
		
		int num = sc.nextInt(); //�迭�� ��ڼ�
		
		int[] height = new int[num];  // ��ڼ��� num�� �迭�� ����
		
		for(int i=0;i<num;i++) {
			System.out.print("height["+i+"]:");
			height[i] = sc.nextInt();
		}
		
		System.out.println("�ִ��� " + maxOf(height) + "�Դϴ�.");
		//�迭����  height��(����)�� �޼��� maxOf�� ����.
		
	}

}
