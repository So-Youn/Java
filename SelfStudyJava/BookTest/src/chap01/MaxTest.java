package chap01;

import java.util.Scanner;

//3���� �������� �Է��ϰ� �ִ� ���ϱ�
public class MaxTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ� ���ϱ�");
		System.out.print("a�� �� :" );
		int a = sc.nextInt();
		System.out.print("b�� �� :" );
		int b = sc.nextInt();
		System.out.print("b�� �� :" );
		int c = sc.nextInt();
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		System.out.println("�ִ���"+max+"�̴�.");
	}

}
