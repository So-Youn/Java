package chap03;

import java.util.Scanner;

public class SeqSearchEx {
	static int seqSearchEx(int[] a,int n,int key) {
		System.out.print("   |");
		for (int k = 0; k < n; k++) 
			System.out.print(k+"\t");
		System.out.println();
		
		System.out.print("---+");
		for(int k=0;k<4*n+2;k++)
			System.out.print("-");
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[i] == key)
				return i; // �˻�����
		}
		return -1; // �˻�����
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��� �� : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		for(int i=0;i<num;i++) {
			System.out.println("x["+i+"]:");
			x[i]=sc.nextInt();
		}
		
		System.out.println("ã�� ��:");
		int key =sc.nextInt();
		
		int index = seqSearchEx(x,num,key);
		// �迭 x���� ���� ky�� ��Ҹ� �˻�
		
		if(index == -1)
			System.out.println(" �� ���� ��Ұ� ����.");
		else
			System.out.println(key+"��"+"x["+index+"]�� �ִ�.");
	}
}
