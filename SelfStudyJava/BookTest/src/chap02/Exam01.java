package chap02;
//�迭 a�� ����� ���� ���
import java.util.Scanner;

public class Exam01 {
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++)
			sum+= a[i];
		return (sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ڼ��£�");
		int num = sc.nextInt();
		
		int[]a = new int[num];
		for(int i=0;i<num;i++) {
			System.out.print("a["+i+"] : ");
			a[i] = sc.nextInt();
		}
		System.out.println(" ����� �հ��"+sumOf(a)+"�̴�.");
		
	}

}
