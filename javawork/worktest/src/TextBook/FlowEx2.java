package TextBook;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {

		char grade = ' ';
		char opt = '0';
		
		System.out.println("������ �Է����ּ���.");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		
		System.out.println("����� ������ " +score+"�Դϴ�.");
		
		if(score>=90) {
			grade = 'A';
			if(score >=98) {
				opt = '+';
			} else if(score<94) {
				opt = '-';
			}
		}	else if (score>=80) {
			grade = 'B';
			if (score>=88) {
				opt ='+';
			} else if (score<84) {
				opt = '-';
			}
		}	else {
			grade = 'C';
		}
		System.out.println("����� ������"+grade+opt +"�Դϴ�");
	}

}
