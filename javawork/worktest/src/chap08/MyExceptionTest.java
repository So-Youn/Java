package chap08;

import java.util.Scanner;

public class MyExceptionTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("�����Է� :"); // Ȧ�� �߻� �� ���� �߻���Ű��
		int num = key.nextInt();
		try {
			
		
		if(num%2==1) {
			//���ܹ߻� ��Ȳ
			//JVM�� �ν��ϴ� ������ �ƴ϶� ����ڰ� ������ �����̹Ƿ� ���ܸ� �߻���ų �� �ֵ��� ����
			throw new MyException("Ȧ���� �Է��߽��ϴ�."); 
		}
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
