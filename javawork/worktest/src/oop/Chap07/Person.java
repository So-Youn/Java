package oop.Chap07;

public class Person {
	private String name;			//�θ�Ŭ������ �ڽ� Ŭ������ �ߺ��� Ŭ������ �Ϲ�ȭ��Ű�� ����. ->private default
	private int age;				//�߿��� ������ private
	Person(){
	//super();	
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void print() {
		System.out.print("����:"+getName()+
				"����:"+getAge());
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
