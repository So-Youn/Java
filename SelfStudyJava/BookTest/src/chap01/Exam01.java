package chap01;

import java.util.Scanner;
//�� ���ϱ� 
public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° �� : ");
		double num1 = Double.parseDouble(sc.nextLine());
		System.out.println("�� ��° ��:");
		double num2 = Double.parseDouble(sc.nextLine());
		System.out.println("================");
		if (num2!=0.0) {
			System.out.println("��� : "+(num1/num2));
		}else {
			System.out.println("��� : ���Ѵ�");
		}
	}
}
