package oop.Chap07.poly.email;
public class SenderLogic {
	public void run(Sender obj) {//(SMSSender obj)(EmailSender obj)�� ����. 
							//�θ�Ÿ���� �Ű������� �����ϸ� �� ���� �� �ֱ� ����.(parent Ÿ��)
		//SenderŬ������ Ŭ�������� Ȱ���ϴ� �żҵ�
		//((EmailSender)obj).print(); �Ұ���.
		System.out.println("���� �Ϸ�");
		obj.print();
		
	}
}
