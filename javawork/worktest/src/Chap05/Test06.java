package Chap05;

public class Test06 {
	public static void main(String[] args) {
		int sum = 0;
		int num1 = Integer.parseInt(args[0]);

		System.out.println("�Է� ��1->" + num1);

		for (int i = 1; i <= 100; i++) {
			if (i % num1 == 0) {
				sum = sum + i;
				System.out.print(i);
				System.out.print("+");
			} else {

			}

		}
		System.out.println("=" + sum);
	}

}
