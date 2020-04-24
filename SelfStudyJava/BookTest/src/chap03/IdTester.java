package chap03;

//���̵� �ο��ϴ� Ŭ����
public class IdTester {
	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a�� ���̵� : "+a.getId());
		System.out.println("b�� ���̵� : "+b.getId());
		
		System.out.println("�ο��� ���̵� ���� : "+Id.getCounter());

	}

}

class Id {
	private static int counter = 0; // ���̵� �� �� �ο��ߴ��� ���� - Ŭ���� �޼���
	private int id; // �ν��Ͻ�

	//�⺻ ������
	public Id() {
		id = ++counter;
	}
	//���̵� ��ȯ�ϴ� �ν���Ʈ �޼���
	public int getId(){
	return id;
	}
	// counter�� ��ȯ�ϴ� Ŭ���� �޼���
	public static int getCounter() {
		return counter;
	}

}