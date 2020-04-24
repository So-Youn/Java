package chap03;

import java.util.Scanner;

public class SeqSearchFor {
	// �迭 a�� ���� n���� ��ҿ��� key�� ���� ��Ҹ� ���� �˻� 
	static int seqSearch(int[] a,int n, int key) {
		for (int i = 0; i < n; i++) 
			if (a[i] == key) 
				return i;
			
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��� �� : ");
		
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num ; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = sc.nextInt();
		}
		
		System.out.println("�O�� �� :");
		int ky = sc.nextInt();
		
		int idx = seqSearch(x,num,ky);
		
		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
	}
	
}
