package chap08;

public class Account {
	private String account;
	private double balance;
	private double interestRate;

	public Account() {

	}

	public Account(String account, double balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccount() {
		return account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		double interest = this.balance * this.interestRate / 100;
		return interest;
	}

	public void deposit(double money) throws Exception { // ȣ���� �� �ְ� ó���ϵ��� ���ܸ� ��������

		if (money < 0) {
			throw new Exception("�Ա� �ݾ��� 0���� �����ϴ�.");
		}
		this.balance = balance + money;
	}

	public void withdraw(int money) throws Exception {
		if (money < 0 | balance < money) {
			throw new Exception();
		}
		this.balance = balance - money;
	}

	public void print() {
		System.out.println("Account(���¹�ȣ):" + getAccount() + ",balance(�ܾ�):" + getBalance());

	}

}
