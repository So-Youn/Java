package oop.Chap07.poly;

import javax.swing.JFrame;
//������ â 
//�������̽��� ����ϴ� ������ ���߻���� ���, �������� ������ �� �ֵ���,
//						�⺻������ �����ؾ��ϴ� ����� �������� �����ϱ� ���� ����
class GUITest extends JFrame implements Runnable{	//�̹� ����ϰ� ���� Ȯ���� ���� ��, runnable ...
	GUITest(String title){
		super(title);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class InterfaceTest {
	public static void main(String[] args) {
		GUITest obj = new GUITest("�������̽� ����");
	}

}
