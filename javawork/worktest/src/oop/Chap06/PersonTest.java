package oop.Chap06;
//PersonŬ������ ����ϴ� Ŭ����
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("�嵿��","�����",45);					//age������ private���� ����Ǿ������Ƿ� ������ �� ����.
											//���� ��Ű���� Ŭ���������� ������ �� ����.
		System.out.println("���� :"+p1.getName());
		System.out.println("�ּ� :"+p1.getAddr());
		System.out.println("���� :"+p1.getAge());
		
		Person p2 = new Person("�輭��","��õ��",25);			//new ������
	
		System.out.println("���� :"+p2.getName());
		System.out.println("�ּ� :"+p2.getAddr());
		System.out.println("���� :"+p2.getAge());
	}

}
