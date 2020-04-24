package chap09.API.lang;
//String Ŭ������ �⺻ �޼ҵ�
public class StringTest02 {

	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("��մ�");
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));
		//index=1�� � ���ڰ� �ִ°�?
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));
		//�� ���� ���ڿ��� ��ģ��
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));
		//'a'���ڿ��� ��� �ִ°�.
		System.out.println("str1.indexOf('��')=>"+str1.indexOf('��'));
		//����� -1 : ���ڿ��� ���� ��.
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));
		//�����ʺ��� ã�´�. ���ʿ� �ִ� a (index ������ �ٲ��� �ʴ´�)
		System.out.println("str1.length()=>"+str1.length());
		
		System.out.println("str1.equals(\"java programming\")=>"+str1.equals("java programming"));
		//str1.equals()�� ��ҹ��ڵ� �����Ѵ�.
		System.out.println("str1.equals(\"Java programming\")=>"+str1.equals("Java programming"));
		
		System.out.println("str1.equalsIgnoreCase(\"java programming\")=>"+str1.equalsIgnoreCase("java programming"));
		//��ҹ��� ���о��Ѵ�.
		System.out.println("str1.equalsIgnoreCase(\"Java programming\")=>"+str1.equalsIgnoreCase("Java programming"));
		
		
		System.out.println("str1.startsWith(\"java\")=>"+str1.startsWith("java"));
		//���ڿ� �� -prefix " �̷� ���ڿ��� �����ϴ���"
		System.out.println("str1.startsWith(\"Java\")=>"+str1.startsWith("Java"));
		
		
		System.out.println("str1.endsWith(\"ming\")=>"+str1.endsWith("ming"));
		//���ڿ� �� -suffix "�̷� ���ڿ��� ��������"
		
		
	}

}
