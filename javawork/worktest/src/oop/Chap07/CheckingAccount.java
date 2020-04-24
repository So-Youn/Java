package oop.Chap07;

public class CheckingAccount extends Account {
	private String cardNo;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(String account, String ownerName, int balance, String cardNo) {
		super(account, balance, ownerName); // ���� ����
		this.cardNo = cardNo;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	//���ڿ� �񱳴� ������ equals�� �̿��ؼ� ���Ѵ�
	//== �� �ȵ�.
	public void pay(String cardNo, int amount) {
		if (this.cardNo.equals(cardNo) && getBalance() >= amount) { //�� ī������ �Ű����� ī������ ������ Ȯ��
											//super�� balance private�̶� �޼ҵ�� ���.
			super.withdraw(amount);
			//�����ϱ� super ��� �ص� ok, ���ص� ok.
		} else {
			System.out.println("������ �Ұ����մϴ�");
		}
	}
}
