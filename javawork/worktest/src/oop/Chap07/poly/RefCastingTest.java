package oop.Chap07.poly;

//객체의 형변환 - 상속관계에 있는 경우에만 가능하다.
class Parent {
	String name = "장동건";

	public void display() {
		System.out.println("부모의 display");
	}
} // child와 parent는 형변환 가능. child와 child2는 형변환 불가능(상속x)

class Child extends Parent {
	String name = "이민호";

	public void display() {
		System.out.println("자식 클래스의 display");
	}

	public void test() {
		System.out.println("하위클래스에만 정의된 메소드");
	}
}

public class RefCastingTest {
	public static void main(String[] args) {
		System.out.println("1.Super타입의 참조변수로 Super객체를 참조");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name);
		
		System.out.println("******************************");
		System.out.println("2.sub타입의 참조변수로 sub객체 참조");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);
		/*
		 * 객체의 형변환
		 * -변수는 참조변수 타입에 따라서 결정, 메소드는 생성되는 객체가 기준
		 */
		System.out.println("******************************");
		System.out.println("3. super타입의 참조변수로 sub객체 참조");
		Parent obj3 = new Child();	//type은 super지만, sub 타입 생성	
		obj3.display();	// 메소드 : 오버라이딩된 메소드라면 오버라이딩 된 메소드가 호출
		System.out.println(obj3.name);	//변수 : 참조변수 타입에 해당하는 
										//클래스의 멤버변수가 실행됨.
		//obj3.test();		-> obj3은 parent라서 자동형변환이 필요하다!
		//타입이 parent 타입이지만 실제로 생성된 객체가 child 타입이기 때문에 child타입으로 형변환이 가능하다.(명시적)
		((Child)obj3).test();	//obj3을 child로 형변환
		System.out.println("******************************");
		System.out.println("4. sub타입의 참조변수로 super객체 참조 불가능");
	//	Child obj4 = new Parent(); //cannot convert from Parent to Child 
		
		System.out.println("******************************");
		System.out.println("5. sub타입의 참조변수 = "
				+"super타입의 참조변수(super객체를 참조)--------x");
		//java.lang.ClassCastException: 명시적으로 형변환을 해서 컴파일러는 속였으나 실행시점에 캐스팅을 하려고 할때,
		//obj1이 child 정보를 갖고 있지 않으므로 캐스팅 예외 발생->
		//Child obj5 = (Child)obj1;	//obj1이 실제로 참조하는게 parent라서 절대 캐스팅 불가능
		
		
		System.out.println("******************************");
		System.out.println("5. sub타입의 참조변수 = "
				+"super타입의 참조변수(Sub객체를 참조)-----ㅇ");
		Child obj6 = (Child)obj3;
		System.out.println(obj6.name);
		obj6.display();
		obj6.test();			//변수는 type에 의존, child 타입을 실제로 참조하기 때문에 캐스팅 가능
		
		Parent obj7 = obj2;//upcasting
		//358page
		Parent obj8 = null;	//교재의 car변수
		Child obj9 = new Child();	//fe
		Child obj10= null;	//fe2
		
		obj8 = obj9; 	//super타입 = sub타입
		obj10 = (Child)obj8;  		//obj8이 parent 타입 같아보이지만, obj9를 넣어놨기 때문에 obj8은 child를 참조한다.
									//참조는 할 수 잇지만 obj8은 parent타입이기 때문에 명시적으로 casting, 실행시점에서 알 수 잇다.
		obj10.test(); // 아무것도 담고있지 않을 때 casting은 되지만, nullpoint.
	}

}
