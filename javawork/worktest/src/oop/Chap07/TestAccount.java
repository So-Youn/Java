package oop.Chap07;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//상위 클래스는 객체 생성 불가능.
		CheckingAccount acc1 = 
			new CheckingAccount("111-222-333","장동건"
					,1000000,"1234-5647-8888");
		//체크카드를 만들었을 때의 cardNo, pay의 cardNo는 지불하면서 인식되는 카드넘버
		System.out.println("카드번호 입력");
		String cardNo = key.next();
		acc1.pay("1234-5678-8888",500000);//카드넘버가 달라서 지불 불가
		System.out.println("현재잔액====>"+acc1.getBalance());
		acc1.pay(cardNo,500000);//같아서 지불 가능
		System.out.println("현재잔액====>"+acc1.getBalance());
		
	}

}
