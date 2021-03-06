package oop.Chap07;

public class CheckingAccount extends Account {
	private String cardNo;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(String account, String ownerName, int balance, String cardNo) {
		super(account, balance, ownerName); // 순서 같기
		this.cardNo = cardNo;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	//문자열 비교는 무조건 equals를 이요해서 비교한다
	//== 는 안됨.
	public void pay(String cardNo, int amount) {
		if (this.cardNo.equals(cardNo) && getBalance() >= amount) { //내 카드멤버와 매개변수 카드멤버가 같은지 확인
											//super의 balance private이라 메소드로 사용.
			super.withdraw(amount);
			//내꺼니까 super 언급 해도 ok, 안해도 ok.
		} else {
			System.out.println("지불이 불가능합니다");
		}
	}
}
