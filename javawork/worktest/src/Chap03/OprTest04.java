package Chap03;
//�񱳿����� - || , && => ���� ������ - ��� ���� �˻����� �ʰ� ���ǿ� �����ϸ� Skip �ϴ� ��� �߻�
public class OprTest04 {
	public static void main(String[] args) {
		int num = 100;
		String str = null; //���� str�� �ƹ��͵� ������� ���� ����
		
		// ||�����ڴ� or �������� Ư���� �ľ��ϰ� ù��° ���� true�̸� ���� ���� �˻����� �ʴ´�
		System.out.println(num>=100 || str.length()>10);
		/* ||�� ���ܸ� �ɷ����µ� |�� ���ܸ� �ɷ����� ����
		 * ||�� ������ ���� check -> �տ� true �� �ڿ� �˻� ���� skip
		 * |�� skip���� ���� �˻�
		 * &&�����ڴ� and �������� Ư���� �ľ��ϰ� ù��° ���� false �̸� ���� ���� �˻������ʴ´�.
		 */
		System.out.println(num<100 && str.length()>10);
	}

}
