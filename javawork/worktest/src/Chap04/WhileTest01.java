package Chap04;
//while�� ����
public class WhileTest01 {
	public static void main(String[] args) {
		int i = 1;
		while(i<5) {
			System.out.println("�ڹ����α׷��� : "+i);
			i++;
		}
		System.out.println("=================");
		i=1; 			//�ٽ� �ʱ�ȭ
			
		while(true) { 	//���� ����
			if(i>5) {
				break;
			}
			System.out.println("�ڹ����α׷��� : "+i);
			i++;
		}
	}

}
