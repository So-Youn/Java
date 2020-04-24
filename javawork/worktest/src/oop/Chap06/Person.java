package oop.Chap06;
/*//Ŭ���� �����ϰ� ������� ����(api�� �ִ� class�� ����� ����)
 * - ������� ������ ���� Ư���� ��츦 �����ϰ� �ʱⰪ�� ���� �ʴ´�
 * - �ʱⰪ�� �������� �ʾƵ� �������� null, �������� 0, �Ǽ����� 0.0, boolean�� false
 * - ��������� ������ �� ���� �����ڸ� �߰��ؼ� ������ ������ �� �ִ�.
 * 		�߰��� �� �ִ� ���� �������� ���� : 
 * 		public
 * 		default
 * 		protected
 * 		private �ܺο��� ���� ���ϰ� �����.
 * 	Ŭ������ ������ �� ��������� private���� �����ؼ� �ܺο��� ������ �� ������ ������ �����ϰ�
 * `public �޼ҵ带 ���ؼ� ������ �� �ֵ��� �����Ѵ�.
*/

public class Person {
	
		@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
		private String name;		//Ŭ������ Ư���� ��Ÿ���� ������ - ������� or �ʵ�
		private String addr;		//��������� Ư�� ��Ȳ�� �ƴϸ� �ʱⰪ�� ���� �ʴ´�.
									//������Ÿ���� �⺻��, ������ ��� ����
		private int age;				
		
		//��� ��������� private���� ����Ǿ� �ֱ� ������ ���� �����ϴ� �޼ҵ��
		//���� ������ �� �ִ� �޼ҵ尡 �ʿ��ϴ�.
		//�̷� ������ �ϴ� �޼ҵ带 �����ϴ� ���
		//name ������ ���� �����ϴ� �޼ҵ�.
		//�޼ҵ�� : set + ��� ���� ��(ù ���ڸ� �빮�ڷ� �ٲ�)
		// 		 setName
		public Person () {
			System.out.println("�⺻������");
		}
		public Person (String name, String addr,int age) {
			this.name = name;
			this.addr = addr;
			this.age=age;
		}
		
		
		
		
		
		public void setName(String name) { //setter�޼ҵ�
			this.name = name;			//this : '��'�� ��Ī. �� ����.
			
		}
		
		//name������ ����� ���� ȣ���ϴ� ������ �Ѱ��� �޼ҵ�
		//�޼ҵ�� : get + ��� ������(ù ���ڸ� �빮�ڷ� �ٲ�)
		// 		 getName
		public String getName() {	//getter�޼ҵ�
			return this.name;
		}
		
		public void setAddr(String addr) { //setter�޼ҵ�
			this.addr = addr;			//this : '��'�� ��Ī. �� ����.
			
		}
		public String getAddr() {	//getter�޼ҵ�
			return this.addr;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		public int getAge() {
			return this.age;
		}
}
