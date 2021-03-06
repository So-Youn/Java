package oop.Chap07;

public class IceCream extends Dessert{
	private int calorie;
	
	public IceCream() {
		super();
	}
	public IceCream(String productName, int price, int count,int calorie) {
		super(productName,price,count);
		this.calorie = calorie;			//icecream에 대한 모든 정보 생성.
	}
	
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public static void print() {			//단순히 제목만 붙는 것이라 static
		System.out.println("===============================");
		System.out.println("주문항목 \t 가격 \t 수량\t 칼로리\t");
		System.out.println("===============================");
	}
	public void printProductInfo() {
		//System.out.println(getProductName()+"\t"+getPrice()+"\t"+getCount()+"\t"+getCalorie()+"kcal");
		super.printProductInfo();
		System.out.println("\t"+getCalorie()+"kcal");
	}
}
