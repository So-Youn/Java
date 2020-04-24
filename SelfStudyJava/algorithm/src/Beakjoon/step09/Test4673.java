package Beakjoon.step09;



//�����ѹ�	
public class Test4673 {

	public static void main(String[] args) { // ����

		boolean[] check = new boolean[10001]; // 1���� 10000�̹Ƿ�

		for (int i = 1; i < 100001; i++) {
			int n = d(i);
			
			if (n < 10001) { // 10000 �� �Ѵ� ���� �ʿ䰡 ����
				check[n] = true;
			}
		}
	
		// boolean �迭���� false �� ������ ��ġ(�ε���)�� ���
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= 10000; i++) {
			if (!check[i]) {// false �� �ε����� ���
				sb.append(i).append("\n");

			}
		}
		System.out.println(sb);
	}	

	public static int d(int number) { // �Լ�
		int sum = number;
		// number��� ���� ������ number�� �����ڷ� �ϴ� ���� ���� ��Ų��.
		while (number != 0) {
			sum = sum + (number % 10); // ù ° �ڸ���
			number = number / 10; // 10�� ������ ù ° �ڸ��� ���ش�.
		}
		return sum;
	}
}
