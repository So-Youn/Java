package Chap04;

import java.util.Scanner;

public class ScoreMultiIf {
//ctrl+shif+f : 줄 정리
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("점수 입력");
		int jumsu = key.nextInt();
		if (jumsu > 100 | jumsu < 0) {
			System.out.println("잘못입력");
		} else {
			if (jumsu >= 90) {
				System.out.println("A");
			} else if (jumsu >= 80) {
				System.out.println("B");
			} else if (jumsu >= 70) {
				System.out.println("C");
			} else if (jumsu >= 60) {
				System.out.println("D");
			} else if (jumsu >= 50) {
				System.out.println("E");
			} else {
				System.out.println("F");
			}

		}

	}
}
