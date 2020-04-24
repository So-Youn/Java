package chap03;
//���� �˻�(���ʹ�)
import java.util.*;
public class seqSearchSen {
	// ��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���ʹ����� ���� �˻��մϴ�.
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;

		a[n] = key;					// ���ʸ� �߰�

		while (true) {
			if (a[i] == key)		// �˻� ����!
				break;
			i++;
		}
		return i == n ? -1 : i;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��ڼ���");
		int num = sc.nextInt();
		int[] x = new int[num+1]; // ��ڼ� num + 1
		
		for(int i=0;i<num;i++) {
			System.out.print("x[" + i + "]��");
			x[i] = sc.nextInt();
		}
		
		System.out.println("�˻� �� : ");
		
		int key = sc.nextInt();
		
		int index = seqSearchSen(x,num,key);
		
		if(index == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(key+"��(��) x[" + index + "]�� �ֽ��ϴ�.");
	}
}
