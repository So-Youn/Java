package Chap04;

public class ForExam {
	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;// ����, ¦����, Ȧ����
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
			if (i % 2 == 0) {
				sum1 = sum1 + i;
			} else {
				sum2 = sum2 + i;
			}
		}
			System.out.println("���� : " + sum);
			System.out.println("¦�� �� :" + sum1);
			System.out.println("Ȧ�� �� :" + sum2);
	}
}
