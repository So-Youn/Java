package Chap03;

import java.util.Scanner;

public class RandTest03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 입력하세요 : ");
		int inputVal = input.nextInt();
		System.out.println(+inputVal>=90?"통과":"재시험");
		
	}

}
