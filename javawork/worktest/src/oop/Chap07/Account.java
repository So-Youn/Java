package oop.Chap07;

public class Account {
	private String account;
	private int balance;
	private String ownerName;
	private double interestRate;
	public Account() {
		
	}
	
	public Account(String account, int balance, String ownerName) {
		this.account = account;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
		
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double calculateInterest() {
		double interest = this.balance *this.interestRate/100;
		return interest;
	}
	public void deposit(int money) {			//입금하고 끝내는 것이기 때문에 void
		this.balance = balance + money;			//따로 출력을 하는 것이 아님. just balance를 바꾸는 역할
	}
	public void withdraw(int money) {			//void이기 때문에 returnX
		this.balance =balance - money;
	}
	public void print() {
		System.out.println("Account(계좌번호):"+getAccount()+",balance(잔액):"+getBalance());
		
	}


	
	
}
