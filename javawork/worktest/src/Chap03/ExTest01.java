package Chap03;

public class ExTest01 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		//���� a�� b�� ��� byte Ÿ��, ���� ������ ������ �ϱ� ���� int�� �ڵ� ��ȯ�ȴ�.int (4byte)�� byte(1byte)�� ��ƾ��ϹǷ� ����ȯ����. 
		char ch = 'A';
		ch = (char)(ch + 2);
		float f = 3 / 2f;
		long l = 3000 * 3000 * 3000L; //�ǿ����� �� �ϳ��� long �̾���Ѵ�.
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float) d==f2; //double���� ��ȿ���ڰ� ���� float ������ ��ȯ���ִ� ���� �� ��Ȯ�ϴ�.
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);


	}

}
