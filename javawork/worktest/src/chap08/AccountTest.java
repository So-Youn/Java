package chap08;

public class AccountTest {

	public static void main(String[] args) {
		Account s1 = new Account("441-0290-1203", 500000.0, 7.3);

		s1.print();
		try { // 더 좋은 방법
			s1.deposit(-10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			s1.withdraw(6000000);
		} catch (Exception e) {
			System.out.println("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}

		double interest = s1.calculateInterest();

		System.out.println("이자 :" + interest);
	}

}
