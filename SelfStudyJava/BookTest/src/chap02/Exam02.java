package chap02;
//�迭 b�� ��� ��Ҹ� �迭 a�� �������� copy�ϴ� �޼ҵ带 �ۼ��ϼ���.
import java.util.Scanner;

public class Exam02 {
		static void rcopy(int[] a,int[] b) {
			int num = a.length<= b.length? a.length : b.length;
			
			for (int i = 0; i <num; i++)
				a[i] = b[b.length - i -1];

		}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�迭 a�� ��ڼ���");
		int na = stdIn.nextInt();		// �迭 a�� ��ڼ�

		int[] a = new int[na];			// ��ڼ��� na�� �迭

		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}

		System.out.print("�迭 b�� ��ڼ���");
		int nb = stdIn.nextInt();		// �迭 b�� ��ڼ�

		int[] b = new int[nb];			// ��ڼ��� nb�� �迭

		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}

		rcopy(a,b);
		System.out.println("�迭 b�� ��� ��Ҹ� �迭 a�� �������� �����߽��ϴ�.");
		for(int i = 0;i<na;i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
