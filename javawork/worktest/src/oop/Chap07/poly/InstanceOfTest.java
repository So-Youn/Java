package oop.Chap07.poly;
/*
 * ��ü�� Ÿ���� �˻��ϰ� �۾��� �� �ִ�.
 * InstanceOf������ �̿�
 * Ÿ�� üũ �Ŀ� ����ϸ� ��Ȯ���� ���� �� �ִ�.
 */
class A{
	
}
interface IA{
	
}
public class InstanceOfTest {
	public static void main(String[] args) {
		SubA obj = new SubA();
		//obj�� SuperAŸ���̶�� if���� �����ض�,
		//	----------------
		//		��
		if(obj instanceof SuperA) {
			System.out.println("SuperA Ÿ���̴�.");
		}else {
			System.out.println("SuperAŸ���� �ƴϴ�.");
		}
		System.out.println("======================");
		if(obj instanceof InterB) {
			System.out.println("InterB Ÿ���̴�.");
		}else {
			System.out.println("InterBŸ���� �ƴϴ�.");
		}
		System.out.println("=====================");
		if(obj instanceof InterC) {
			System.out.println("InterC Ÿ���̴�.");
		}else {
			System.out.println("InterCŸ���� �ƴϴ�.");
		}
		System.out.println("=====================");
		if(obj instanceof IA) {
			System.out.println("IA Ÿ���̴�.");
		}else {
			System.out.println("IA Ÿ���� �ƴϴ�.");
		}
	}
	

}
