package Beakjoon.basic;
//while�� �̿��ؼ� A+B ����ϱ�
/* 
 * �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
 * �̷��� �������� ���α׷� ���Ḧ ���� ������ �ҽ��κ��� ���̻� ���� �� �ִ� �����Ͱ� ������ ��Ÿ���� �ϴµ�,
 * �̸� ���� �� (EOF)��� �Ѵ�. 
 * Java������ �� �� hasNext() �޼��带 �̿��Ѵ�. 
 */
import java.util.*;
public class Test10951 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
		if(num1>0&&num2<10) {
			System.out.println((num1+num2));
		}
		
		}
		sc.close();
	}
	
}
