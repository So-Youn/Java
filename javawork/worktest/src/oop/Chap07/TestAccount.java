package oop.Chap07;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//���� Ŭ������ ��ü ���� �Ұ���.
		CheckingAccount acc1 = 
			new CheckingAccount("111-222-333","�嵿��"
					,1000000,"1234-5647-8888");
		//üũī�带 ������� ���� cardNo, pay�� cardNo�� �����ϸ鼭 �νĵǴ� ī��ѹ�
		System.out.println("ī���ȣ �Է�");
		String cardNo = key.next();
		acc1.pay("1234-5678-8888",500000);//ī��ѹ��� �޶� ���� �Ұ�
		System.out.println("�����ܾ�====>"+acc1.getBalance());
		acc1.pay(cardNo,500000);//���Ƽ� ���� ����
		System.out.println("�����ܾ�====>"+acc1.getBalance());
		
	}

}
