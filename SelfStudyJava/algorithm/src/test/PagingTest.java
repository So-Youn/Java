package test;

public class PagingTest {
	public static void main(String[] args) {
		int totalCount = 25; // ���� DB �� ����� �Խù��� ��
		int countList = 10; //�� �������� ��µǴ� ������ �� 
		int totalPage = totalCount/countList;
		int page = 2; //����  ������ ��ȣ 
		int countPage=10; // �� ȭ�鿡 ��µ� ������ �� 
		if(totalCount % countList > 0) {
			totalPage++;
		}
		//�������� ���� ��쿡�� +1 �� ���ش�.
		System.out.println("��������"+totalPage);
		//���� ������ ��ȣ�� �������� ��ȣ���� ũ�ٸ� ? ġȯ���ֱ�
		if(totalPage<page) {
			page = totalPage;
		}
		System.out.println("���� ������"+page);
	}
		
}