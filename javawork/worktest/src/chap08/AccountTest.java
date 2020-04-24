package chap08;

public class AccountTest {

	public static void main(String[] args) {
		Account s1 = new Account("441-0290-1203", 500000.0, 7.3);

		s1.print();
		try { // �� ���� ���
			s1.deposit(-10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			s1.withdraw(6000000);
		} catch (Exception e) {
			System.out.println("�ݾ��� 0���� ���ų� ���� �ܾ׺��� �����ϴ�.");
		}

		double interest = s1.calculateInterest();

		System.out.println("���� :" + interest);
	}

}
