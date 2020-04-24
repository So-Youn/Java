package oop.Chap07.poly;

public class Coffee extends Beverage{
	static int amount;		//���� ���� 
							//�����ڰ� �ѹ��� ����� ������ amount+1�� �Ǿ� amount�� �ٽ� ����ȴ�.
	/*���� ���� ; amount �� ������ �� �ֵ��� �����ڿ� �ۼ��մϴ�.(��, ��ü�� �����Ǵ� ���� �ֹ��Ǵ� ���̶�� �����ϸ� �˴ϴ�.) 
	 * �����ڰ� ȣ�� �ƴٴ� �� = Ƽ�� �ǸŰ� �Ǿ��ٴ� ��.
	 * => �ֹ��Ǵ� ������ ���� ���
	 * */
	
	

	
	
	public Coffee() {
		
	}
	public Coffee(String name) {
		super(name);
		amount++;
		calcPrice();
	}
	
	
	@Override
	public void calcPrice() {
		if(getName().equals("Americano")) {
			setPrice(1500);
		}else if(getName().equals("CafeLatte")) {
			setPrice(2500);
		}else if(getName().equals("Cappuccino")) {
			setPrice(3000);
		}
	}
	//static ����� �׼��� �ϱ� ���ؼ� static �޼ҵ带 �����ؼ� �׼����Ѵ�.
	public static int getAmount() {
		return amount;
	}
	

}
