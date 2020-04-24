package oop.Chap07.poly;

public class CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop��������****");
		Beverage[] beverage = new Beverage[5];
		beverage[0] = new Coffee("Cappuccino");			//coffee�� beverage ���
		beverage[1] = new Coffee("CafeLatte");
		beverage[2] = new Tea("ginsengTea");
		beverage[3] = new Coffee("CafeLatte");
		beverage[4] = new Tea("redginsengTea");
		getSalesInfo(beverage);
		System.out.println("�� �Ǹ� �ݾ�==>" + getTotalPrice(beverage));
		System.out.println("Coffe�� �Ǹ� ����=>" + Coffee.amount + "��");
		System.out.println("Tea�� �Ǹ� ����=>" + Tea.amount + "��");
	}

	public static void getSalesInfo(Beverage[] beverage) {
		for (int i = 0; i < beverage.length; i++) {
			//beverage[i].calcPrice();
			System.out.print((i+1) + "��° ");
			beverage[i].print();
		}
	}

	public static int getTotalPrice(Beverage[] beverage) {	//static �޼ҵ忡�� �׳� ȣ�⸸ �ϰ��ֱ� ������
		int price = 0;
		for (int i = 0; i < beverage.length; i++) {
			price = price + beverage[i].getPrice();//beverage�� ��ü�� ����� getPrice()ȣ��.

		}
		return price;
	}

}
