package chap09.API.lang;
//StringŬ������ �⺻ �޼ҵ�� StringŬ������ Ư¡
//=> ���ڿ� ó�� �޼ҵ带 ���� ȣ���ϰų� +�����ڷ� ���ڿ��� �����ϴ� �۾��� ���� ��� (���ڿ� ������ ����ϰ� �Ͼ�� ���)
//   String�� ������� �ʰ� StringBuffer or StringBuilder�� �̿��Ѵ�.
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("��մ�.");
		//��ȯ
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());
		//�빮�ڷ� ��ȯ
		System.out.println("���� ������:"+str1);
		System.out.println("str1.toLowerCase()=>"+str1.toLowerCase());
		//�ҹ��ڷ� ��ȯ
		System.out.println("str1.substring(2)=>"+str1.substring(2));
		//v���� ��ü �� ���
		System.out.println("str1.substring(2,8)=>"+str1.substring(2,8));
		//2~7�� ��ġ���� ���(a<=str1<b)
		System.out.println("str1.replance('a','A')=>"+str1.replace('a', 'A'));
		//'a'�� ã�Ƽ� 'A'�� �ٲٱ�
		System.out.println("���� ������:"+str1);
		
	}

}
