package Chap05;

public class ArgsTest {

	public static void main(String[] args) {
		/*
		 *		args = new String[2];
		 *						����� �Ű������� ������ŭ ����
		 *		args[0] = "100"
		 *		args[1] = "200"
		 */		
		System.out.println("����� �Ű����� ->"+args[0]);
		System.out.println("����� �Ű����� ->"+args[1]); // 0,1 2�� �Է¹���
		
		for (int i=0; i<args.length;i++) {
			System.out.println(args[i]);
		}
		System.out.println("��=>"+(args[0]+args[1]));  		//String�̱� ������ ����� ���� �ʰ�, 100, 200���� ���
		
	//	int num1 = args[0]; 		//int =  String x
		int num1 = Integer.parseInt(args[0]);	//String�� �Ű������� ����
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("��=>"+ (num1+num2)); 
	}

}
