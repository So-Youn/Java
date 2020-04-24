package chap08;

import java.util.InputMismatchException;
import java.util.Scanner;

// ���� ���� ���ܰ� �߻��ϴ� ��� ó���ϴ� �۾�
// ����ڰ� �Է��ϴ� ���� ���� ���ܰ� �ٸ��� �߻�.
// 1. ����ڰ� ����� ���� �Է� : ���ܰ� �߻����� �����Ƿ� catch���� ������� �ʴ´�.
// 2. ����ڰ� ���� ���ڿ� 0�� �Է��ϸ�
//			=> ArithmeticException �߻�
// 			=> Exception e = new ArithmeticException();
//	   		------------		-----------------------
//             ����Ÿ��				������ü
// 3. ����ڰ� ���ڰ� �ƴ϶� ���ڸ� �Է��ϸ� 
//		:InputMismatchException();
//		=> Exception e = new InputMismatchException();
//	- �پ��� Exception �� ó���� ���ؼ� catch ������ ������ �����ϰ� ����� �� �ִ�.
//	- ���� Ÿ�Կ� ���ϴ� Exception�� ���� ���߿� �����ؾ� �Ѵ�.
public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
			System.out.println("start");
			System.out.println("���ڸ� �Է��ϼ���");
			int num1 = key.nextInt();
			System.out.println("���� ���ڸ� �Է��ϼ���");
			int num2 = key.nextInt();
			System.out.println("��� : " + (num1 / num2));
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��� �� �����ϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("���� ���ڿ� 0�� �Է��� �� �����ϴ�.");
		} catch (Exception e) {// ��� ����Ŭ������ ����Ŭ����
			System.out.println("���� �߻�");
			System.out.println("���ܸ޽���:" + e.getMessage());
		}

	}
}