package Beakjoon.step06;

import java.util.Scanner;

//String Ŭ���� �̿�
/*
 * valueOf(number) : �ش� number�� String���� ��ȯ�Ͽ� ��ȯ
 * length() : ���ڿ��� ���� ��ȯ
 * charAt(index) : �ش� ���ڿ��� index�� ��ġ�� ���ڸ� char ������ ��ȯ�Ѵ�.
 */
public class Test2577_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int[] counts = new int[10];
		String input = String.valueOf(a * b * c);
		for (int i = 0; i < input.length(); i++) {
			counts[input.charAt(i) - '0']++;
		}
		for (int i = 0; i < counts.length; i++) {
			System.out.println(counts[i]);
		}

	}

}
