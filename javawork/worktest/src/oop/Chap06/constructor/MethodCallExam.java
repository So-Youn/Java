package oop.Chap06.constructor;
//�޼ҵ��� ȣ�� ����
public class MethodCallExam {
	public void test() {
		first();//test���� firstȣ��
	}
	public void first() {
		second();
	}
	public void second() {
		System.out.println("second()~~~~");
	}
	//program����Ǳ� ���� class�� ���� ������ static ����� �޸𸮿� �Ҵ�ȴ�. 
	//�ڵ尡 ����Ǹ鼭 new�� ������ heap�� ������ �÷�����. ����
	public static void main(String[] args) {
		MethodCallExam obj = new MethodCallExam();
		obj.test();
	}
}
