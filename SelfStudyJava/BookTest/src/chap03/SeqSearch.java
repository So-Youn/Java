package chap03;

import java.util.Scanner;

public class SeqSearch {
	
		// �迭 a�� ���� n���� ��ҿ��� key�� ���� ��Ҹ� ���� �˻� 
		static int seqSearch(int[] a, int n , int key) {
			int i =0;
			while(true) {
				if(i==n)
					return -1;   // �˻� ����!(-1�� ��ȯ)
				if (a[i]==key)
					return i;   // �˻� ����!(�ε����� ��ȯ)
				i++;
			}
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("��ڼ���");
			
			int num = sc.nextInt();
			int[] x = new int[num];
			
			for (int i = 0; i < num; i++) {
				System.out.println("x["+i+"]:");
				x[i] = sc.nextInt();
			}
			System.out.print("�˻��� ����");		// Ű ���� �Է�
			int ky = sc.nextInt();
			
			int idx = seqSearch(x, num , ky);
			//�Էµ� �� , ���� , key
			if(idx == -1)
				System.out.println(" �� ���� ��Ұ� ����");
			else
				System.out.println(ky+"��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}

}
