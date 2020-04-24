package chap08;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڷ� ��ȯ�� ���ڿ��� �Է¹ٶ��ϴ�.");
		String str = scan.nextLine();
		int result = 0;
		try {
			result=convert(str); 				//convert()�� ����� result���� �־��ش�.
			System.out.println("��ȯ�� ���ڴ�"+result+"�Դϴ�.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	private static int convert(String str) 
			throws IllegalArgumentException {
		int result=0;
		if (str== null | str.length() == 0) {
			throw new IllegalArgumentException("���ܰ� �߻��Ǿ����ϴ�. ���ڿ��� �Է����� �ʰ� EnterŰ �� �����̽��ϴ�.");
		} else {
			 result = Integer.parseInt(str);
		}
		return result;
	}
}