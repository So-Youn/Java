package oop.Chap06;
//�޼ҵ� �����ϴ� ������ ���� Ŭ����
public class MyMethod {
	//4. �Ű�����, ���ϰ��� ��� �ִ� �޼ҵ�
	//=> ���� 2���� �Ű������� ���޹޾� ���ؼ� ����� �����ϴ� �޼ҵ�
	// 	 �޼ҵ� ����ο� ����Ÿ���� �����ϴ� ��� �ݵ�� �޼ҵ��� ���������� 
	//  ���� �����ؾ� �Ѵ�.
	
	public int add(int num1, int num2) {
		int result =0;
		result = num1 +num2;
		return result;
	}
	
	//3. ���� ���� ���� �Ű������� �� ���� �޼ҵ�
	//=> ��±�ȣ, ��� Ƚ���� �Ű������� ���޹޾� ����� �� �ֵ���
	//		�޼ҵ带 �����ϰ�, MyMethodTest.java���� ȣ���ؼ� �׽�Ʈ�ϱ�
	public void display(String str, int num) {		//�Ű����� Ÿ���� ������ �ٸ��� �ٸ� �޼ҵ�.
		
		for (int i = 1;i<=num;i++) {
			System.out.print(str);
		}
		System.out.println( );
	}
	//2. �Ű������� �ְ� ���ϰ��� �ϳ� �ִ� �޼ҵ�
	public void display(String str) { //String Ÿ������ ������ ����
		for (int i = 1;i<=10;i++) {
			System.out.print(str);
		}
		System.out.println( );
	}
	//1. �Ű������� ���� ���ϰ��� ���� �޼ҵ�
	public void display() { 
		for (int i = 1;i<=10;i++) {
			System.out.print("*");
		}
		System.out.println( );
	}

}
