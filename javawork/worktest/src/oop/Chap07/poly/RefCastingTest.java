package oop.Chap07.poly;

//��ü�� ����ȯ - ��Ӱ��迡 �ִ� ��쿡�� �����ϴ�.
class Parent {
	String name = "�嵿��";

	public void display() {
		System.out.println("�θ��� display");
	}
} // child�� parent�� ����ȯ ����. child�� child2�� ����ȯ �Ұ���(���x)

class Child extends Parent {
	String name = "�̹�ȣ";

	public void display() {
		System.out.println("�ڽ� Ŭ������ display");
	}

	public void test() {
		System.out.println("����Ŭ�������� ���ǵ� �޼ҵ�");
	}
}

public class RefCastingTest {
	public static void main(String[] args) {
		System.out.println("1.SuperŸ���� ���������� Super��ü�� ����");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name);
		
		System.out.println("******************************");
		System.out.println("2.subŸ���� ���������� sub��ü ����");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);
		/*
		 * ��ü�� ����ȯ
		 * -������ �������� Ÿ�Կ� ���� ����, �޼ҵ�� �����Ǵ� ��ü�� ����
		 */
		System.out.println("******************************");
		System.out.println("3. superŸ���� ���������� sub��ü ����");
		Parent obj3 = new Child();	//type�� super����, sub Ÿ�� ����	
		obj3.display();	// �޼ҵ� : �������̵��� �޼ҵ��� �������̵� �� �޼ҵ尡 ȣ��
		System.out.println(obj3.name);	//���� : �������� Ÿ�Կ� �ش��ϴ� 
										//Ŭ������ ��������� �����.
		//obj3.test();		-> obj3�� parent�� �ڵ�����ȯ�� �ʿ��ϴ�!
		//Ÿ���� parent Ÿ�������� ������ ������ ��ü�� child Ÿ���̱� ������ childŸ������ ����ȯ�� �����ϴ�.(�����)
		((Child)obj3).test();	//obj3�� child�� ����ȯ
		System.out.println("******************************");
		System.out.println("4. subŸ���� ���������� super��ü ���� �Ұ���");
	//	Child obj4 = new Parent(); //cannot convert from Parent to Child 
		
		System.out.println("******************************");
		System.out.println("5. subŸ���� �������� = "
				+"superŸ���� ��������(super��ü�� ����)--------x");
		//java.lang.ClassCastException: ��������� ����ȯ�� �ؼ� �����Ϸ��� �ӿ����� ��������� ĳ������ �Ϸ��� �Ҷ�,
		//obj1�� child ������ ���� ���� �����Ƿ� ĳ���� ���� �߻�->
		//Child obj5 = (Child)obj1;	//obj1�� ������ �����ϴ°� parent�� ���� ĳ���� �Ұ���
		
		
		System.out.println("******************************");
		System.out.println("5. subŸ���� �������� = "
				+"superŸ���� ��������(Sub��ü�� ����)-----��");
		Child obj6 = (Child)obj3;
		System.out.println(obj6.name);
		obj6.display();
		obj6.test();			//������ type�� ����, child Ÿ���� ������ �����ϱ� ������ ĳ���� ����
		
		Parent obj7 = obj2;//upcasting
		//358page
		Parent obj8 = null;	//������ car����
		Child obj9 = new Child();	//fe
		Child obj10= null;	//fe2
		
		obj8 = obj9; 	//superŸ�� = subŸ��
		obj10 = (Child)obj8;  		//obj8�� parent Ÿ�� ���ƺ�������, obj9�� �־���� ������ obj8�� child�� �����Ѵ�.
									//������ �� �� ������ obj8�� parentŸ���̱� ������ ��������� casting, ����������� �� �� �մ�.
		obj10.test(); // �ƹ��͵� ������� ���� �� casting�� ������, nullpoint.
	}

}
