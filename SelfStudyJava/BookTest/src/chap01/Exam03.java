package chap01;

import java.util.Scanner;

//�α��� 
public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� : ");
		String name = sc.nextLine();
		System.out.println("�н�����:");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);
		if (name.equals("java")) {
			if (password == 12345) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ���� : �н����� ����");
			}
		} else {
			System.out.println("�α��� ���� : ���̵� �������� ����");
		}

	}

}
