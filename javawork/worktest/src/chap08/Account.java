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

	public void deposit(double money) throws Exception { // 호출할 수 있게 처리하도록 예외를 던져버림

		if (money < 0) {
			throw new Exception("입금 금액이 0보다 적습니다.");
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
		System.out.println("Account(계좌번호):" + getAccount() + ",balance(잔액):" + getBalance());

	}

}
