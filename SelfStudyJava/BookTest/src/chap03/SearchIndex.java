package chap03;

import java.util.Scanner;

//� ���� ���� �迭 ���� ��� ��Ҹ� �ٸ� �迭�� ������
public class SearchIndex {
	// �迭 a�� ���� n�� ��ҿ��� key�� ���� ��� ����� index�� �迭idx�� �Ӹ����� ���ʷ� �����Ͽ� ���� ��ڼ��� ��ȯ
	static int searchIdx(int[] a,int n,int key,int[] idx) {
		int count = 0;
		for(int i=0;i<n;i++)
			if(a[i]==key) {
				idx[count++] = i;
			}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��� ��:");
		
		int num = sc.nextInt();
		int[] x = new int[num];
		int[] y = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x["+i+"]:");
			x[i] = sc.nextInt();
			}
		System.out.print("ã�� ����"); // Ű ���� �Է� ����
		int ky = sc.nextInt();
		
		int count = searchIdx(x, num, ky, y);
		
		if(count ==0)
			System.out.println("�� ���� ��Ұ� ����");
		else {
			for(int i =0;i<count;i++)
				System.out.println("�� ���� " + "x[" + y[i] + "]�� �ֽ��ϴ�.");
		}
	}

}
