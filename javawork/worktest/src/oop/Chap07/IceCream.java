package oop.Chap07;

public class IceCream extends Dessert{
	private int calorie;
	
	public IceCream() {
		super();
	}
	public IceCream(String productName, int price, int count,int calorie) {
		super(productName,price,count);
		this.calorie = calorie;			//icecream�� ���� ��� ���� ����.
	}
	
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public static void print() {			//�ܼ��� ���� �ٴ� ���̶� static
		System.out.println("===============================");
		System.out.println("�ֹ��׸� \t ���� \t ����\t Į�θ�\t");
		System.out.println("===============================");
	}
	public void printProductInfo() {
		//System.out.println(getProductName()+"\t"+getPrice()+"\t"+getCount()+"\t"+getCalorie()+"kcal");
		super.printProductInfo();
		System.out.println("\t"+getCalorie()+"kcal");
	}
}
