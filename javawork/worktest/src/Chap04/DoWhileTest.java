package Chap04;

import java.util.Scanner;

public class DoWhileTest {
//while���� do....while���� ������
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = 0;
		while(num>10) { 	//while���� �õ��� ���ϰ� ����.
			System.out.println("�����Է�");
			num = key.nextInt();
			//while���� ������ �������� ������ �� ���� �ڵ尡 ������� �ʴ´�.
			System.out.println("while�� - �����ɹ� :"+num);
		}
		do {
			System.out.println("�����Է�");
			num = key.nextInt();
			System.out.println("Do - while�� - �����ɹ� :"+num);
		}while(num>10);
			
		
	}

}
