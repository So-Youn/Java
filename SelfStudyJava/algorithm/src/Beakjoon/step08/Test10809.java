package Beakjoon.step08;

import java.util.Scanner;

public class Test10809 {
//indexOf : Ư�� ���ڿ��� index �� ����
//Ž���Ϸ��� ���ڿ��� �������� �ʴ´ٸ� -1 ��ȯ
//�ؽ�Ʈ�� ���Կ��� Ȯ���� match() ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		for (char c = 'a';c<='z';c++) {
			System.out.print(input.indexOf(c)+" ");
		}

	}

}
