package oop.Chap07;

public class Person {
	private String name;			//부모클래스는 자식 클래스의 중복된 클래스를 일반화시키기 위함. ->private default
	private int age;				//중요한 정보라 private
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
		System.out.print("성명:"+getName()+
				"나이:"+getAge());
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
