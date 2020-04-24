package oop.Chap06.constructor;

public class AccountTest {

	public static void main(String[] args) {
		Account s1 = new Account("441-0290-1203",500000,7.3);

		s1.print();
		s1.deposit(20000);
		s1.print();
		
	
		double interest = s1.calculateInterest();
		
		System.out.println(+interest);
	}

}
