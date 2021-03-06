package oop.Chap07;

import oop.Chap07.poly.Child;
import oop.Chap07.poly.Parent;

/*
 * <상속관계에서 메소드가 갖는 특징>
 * 1. 상속관계에서는 상위클래스에 정의된 메소드를 하위클래스에서 사용할 수 있다
 * (하위클래스 참조 변수를 통해서 접근할 수 있다.)
 * 2. 상위클래스에 정의된 메소드와 동일한 메소드를 하위클래스에서 정의하고 사용할 수 있다.
 * 이런 경우 하위 클래스의 메소드가 우선 인식된다.
 * 	=> 상위클래스에 선언된 메소드와 동일한 메소드를 하위클래스에 정의하는 것을 메소드 재정의(메소드 오버라이딩)라고 한다. 
 * 										                       ------------------
 * 												메소드 선언부가 부모클래스의 `ㅁㅔ소드 선언부`와 반드시 일치해야 한다.
 * 												 메소드명, 매개변수 갯수, 매개변수 타입, 리턴타입 모두 동일해야 한다.
 * 3. 부모 클래스의 메소드를 사용하고 싶은 경우 super로 호출한다.
 * 
 */
class Parent{
	public void display() {
		System.out.println("부모의 display...");
	}
}
class Child extends Parent{
	public void display() {		//메소드 오버로딩
		System.out.println("자식클래스의 test");
		super.display(); // 부모클래스의 메소드 사용
		
	}
	public void test() {
		System.out.println("자식 클래스의 test...");
		display();
	}
}
public class InheritanceTest02 {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.test();			//자식클래스의 display 호출
		obj.display();
	}

}
