package Beakjoon.step08;
import java.util.*;
/*
 * ���̾�
 * ���� 1�� �ɷ��� �� 2�ʰ� �ʿ��ϴ�. 
 * 1���� ū ���� �Ŵµ� �ɸ��� �ð��� �̺��� �� �ɸ���, �� ĭ ���� �ִ� ���ڸ� �ɱ� ���ؼ� 1�ʾ� �� �ɸ���.
 * ������� �ҸӴϴ� ��ȭ ��ȣ�� �� ���ڿ� �ش��ϴ� ���ڷ� �ܿ��. ��, � �ܾ �� ��, �� ���ĺ��� �ش��ϴ� ���ڸ� �ɸ� �ȴ�.
 * ���� ���, UNUCIC�� 868242�� ����.
 * �ҸӴϰ� �ܿ� �ܾ �־����� ��, �� ��ȭ�� �ɱ� ���ؼ� �ʿ��� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Test5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char arr[] = input.toCharArray();
		
		int sum=0;
		for(char i:arr) {
			sum +=Dial(i) +1;
			System.out.print(Dial(i)+" ");
		}
		
		System.out.print("�� �ɸ� �ð�"+sum);
			
	}

	private static int Dial(char input) {
		switch(input) {
		case 'A' : case 'B' : case 'C' :
			return 2;
		case 'D' : case 'E' : case 'F' :
			return 3;
		case 'G' : case 'H' : case 'I' :
			return 4;
		case 'J' : case 'K' : case 'L' :
			return 5;
		case 'M' : case 'N' : case 'O' :
			return 6;
		case 'P' : case 'Q' : case 'R' : case 'S' :
			return 7;
		case 'T' : case 'U' : case 'V' : 
			return 8;
		case 'W' : case 'X' : case 'Y' : case 'Z' :
			return 9;
		default:
			return -1;
		}
		
	}

}
