package chap09.API.lang;

public class StringExam {

	public static void main(String[] args) {
		//str1�� AVAJ�� ��µǵ��� �����ϼ���
		//��, stringBuffer�� reverse()������� �ʱ�
		//StringŬ������ charAt(0)�� toUpperCase()Ȱ���ϱ�.
		//string�� refence��
		String str1 = "java";
		//�ѹ��ھ� ���
		for(int i=0;i<str1.length();i++) {
			System.out.print(str1.charAt(i));
		}
		System.out.println( );
		//�Ųٷ� ���
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.print(str1.charAt(i));
		}
		
		System.out.println( );
		//�빮�ڷ� ���
		String data = str1.toUpperCase();
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.print(data.charAt(i));
		}
		
	}

}
