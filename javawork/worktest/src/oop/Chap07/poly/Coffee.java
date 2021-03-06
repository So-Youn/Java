package oop.Chap07.poly;

public class Coffee extends Beverage{
	static int amount;		//공유 변수 
							//생성자가 한번씩 선언될 때마다 amount+1이 되어 amount에 다시 저장된다.
	/*문제 조건 ; amount 에 누적될 수 있도록 생성자에 작성합니다.(즉, 객체가 생성되는 것이 주문되는 것이라고 생각하면 됩니다.) 
	 * 생성자가 호출 됐다는 것 = 티가 판매가 되었다는 것.
	 * => 주문되는 음료의 가격 계산
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
	//static 멤버를 액세스 하기 위해서 static 메소드를 정의해서 액세스한다.
	public static int getAmount() {
		return amount;
	}
	

}
