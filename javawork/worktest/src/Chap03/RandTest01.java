package Chap03;

import java.util.Random;

public class RandTest01 {

	public static void main(String[] args) {
	Random rand = new Random();
	int randVal = rand.nextInt(100);
	System.out.println("���� ���� ����ϱ� : "+randVal);
	
	//1. API���� �����ϴ� Ŭ������ �ڹ� ���α׷� �ȿ��� ����ϱ� ���� �޸𸮿� �ø��� �۾�
			//-> JVM�� �ν��ϴ� �۾� ������ �Ҵ�
			//�����Ŭ������(type) ���� = new ����� Ŭ���� ��()
			
			/*//2. ��ü(Ŭ������ ����ϱ� ���� �޸𸮿� �÷� ���� ��)�� �޼ҵ� ����ϱ�
			 * -> �ν��Ͻ���� ��.
			 * charAt�� ���� ����� charŸ���̹Ƿ� ���� Ÿ���� ������ �����ؼ� ����.
			 * String => ���ڿ� ����.���ڿ��� index, �� ������ ����
	*/		
			String str2 = new String("java programming");
			char returnVal = str2.charAt(0); //0�� ��ġ�� �ִ� ���ڸ� charŸ������ ��ȯ
			System.out.println("������=>"+returnVal);
			
			/*//i love you��� ���ڿ��� �̿��ؼ� string��ü�� �����ϱ�
			�� ���ڿ��� ���̸� ������ ���� �������� ����ϼ���
			���ڿ��� ���� =>____
			
	*/		
			String str3 = new String("i love you");
			int returnVal3 = str3.length();
			System.out.println("���ڿ��� ����=>"+returnVal3);
}
}

