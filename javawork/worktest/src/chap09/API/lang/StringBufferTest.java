package chap09.API.lang;
//StringBuffer �׽�Ʈ
public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		System.out.println("����=>"+sb);
		
		sb.append("��մ�");	// �� ���� ���ڿ� + ��� ( ���� ����)
		System.out.println("����=>"+sb);
		
		sb.insert(2,"�ڹ�");	//index��ġ�� ���ڿ��� �߰�
		System.out.println("����=>"+sb);
		
		sb.delete(2,6);	//begin ~ end-1 ����
		System.out.println("����=>"+sb);
		
		sb.reverse();	//���ڿ��� ������ �Ųٷ�
		System.out.println("����=>"+sb);
		
		
	}

}
