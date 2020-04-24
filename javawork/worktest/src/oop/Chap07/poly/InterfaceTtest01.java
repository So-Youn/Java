package oop.Chap07.poly;
/*
 * �������̽� ����
 * <<�������̽�>>
 * => �߻�޼ҵ�(����� ����)�� �����ϴ� Ư���� Ŭ����
 * 
 * 1. �������̽��� interface Ű���带 �̿��ؼ� �����Ѵ�.
 * 2. �������̽��� �߻�޼ҵ常 �����ϴ� Ư���� Ŭ����
 * - public abstract�� ��������.
 * - ��ӹ����� �ڵ����� �߰��ȴ�.
 * 3. �������̽��� �������̽��� ����� �� �ִ�.(Extends �̿�)
 * - �����������̽��� �����������̽��� �߻�޼ҵ带 ��ӹ޴´�.
 * 4. Ŭ������ �������̽��� ����� �� �ִ�. (implements �̿�)
 * - �������̽��� ��ӹ޴� Ŭ������ �̹� �ٸ� Ŭ������ ����ϴ� ��쿡 
 *   extends�� ���� �����ϰ�, implements�� �����ؾ��Ѵ�.
 * 5. �������̽��� ���� ���� ����� �� �ִ�. ��, ���� ����� �����ϴ�.
 * - implements �ڿ� �������̽��� ������ �� ,�� �����ؼ� �����Ѵ�.
 * 6. Ŭ������ �������̽����� ��ӹ޴� ����Ŭ������ ��� Ŭ������ �������̽��� ������ �νĵȴ�.
 * 	 (��ӹ޴� ��� Ŭ����, �������̽��� ���� Ÿ���� �ȴ�.)
 */
interface InterA{
	public abstract void test();
	void display(int num); //������ �߻�޼ҵ��̱� ������ ���� ����
}
interface InterB extends InterA{
	void show();	//�߻�޼ҵ� �� 3��
}
interface InterC{
	
}
class SuperA{
	
}
//SubA�� SuperA,InterA,InterC
class SubA extends SuperA implements InterB,InterC{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceTtest01 {
	public static void main(String[] args) {
	 SuperA obj1 = new SubA();
	 InterA obj2 = new SubA();
	 InterB obj3 = new SubA();
	 InterC obj4 = new SubA();		//4���� ������ ���� - �پ缺 �ش�ȭ.
	}

}
