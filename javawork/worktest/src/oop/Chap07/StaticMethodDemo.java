package oop.Chap07;
//static �޼ҵ�

//-static����� �����ϱ� ���� �뵵
//-��ƿ��Ƽó�� ���� ����ϴ� �޼ҵ� ex)lang.math

public class StaticMethodDemo {
	public static void staticTest1() {
		//1.static�޼ҵ忡�� static�޼ҵ� �����ϱ�- �Ϲ����� ��� ����
		staticTest2();
		
		System.out.println("staticTest1");
	}

	public void display() {
		//2.non-static�޼ҵ忡�� non-static�޼ҵ� ȣ�� - �Ϲ����� ��� ����
		show();
		System.out.println("display()");
	}
	public static void staticTest2(){
		System.out.println("staticTest2");
	}
	public void show() {
		//3.non-static���� static �޼ҵ� ȣ��-- �Ϲ����� ��� ȣ��
		staticTest2();
		System.out.println("show()");
	}
	public static void staticTest3() {
		//4. static���� non-static�޼ҵ� ȣ��
		//->non-static �޼ҵ尡 �޸𸮿� ���� ������ ���� Ŭ�������� ���ǵ� �޼ҵ��� �ϴ��� ������ ��ü���� �Ŀ� ȣ���ؾ��Ѵ�.
		StaticMethodDemo obj = new StaticMethodDemo();
		obj.show();			//Ŭ���� ��� ������ �Ϲ� �޼ҵ尡 �ö������ �ʴ�.
		System.out.println("staticTest3()");
	}
}
