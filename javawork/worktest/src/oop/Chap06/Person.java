package oop.Chap06;
/*//클래스 정의하고 멤버변수 정의(api에 있는 class와 사용방법 동일)
 * - 멤버변수 정의할 때는 특별한 경우를 제외하고 초기값을 주지 않는다
 * - 초기값을 정의하지 않아도 참조형은 null, 정수형은 0, 실수형은 0.0, boolean은 false
 * - 멤버변수를 정의할 때 접근 제어자를 추가해서 접근을 제어할 수 있다.
 * 		추가할 수 있는 접근 제어자의 종류 : 
 * 		public
 * 		default
 * 		protected
 * 		private 외부에서 보지 못하게 감춘다.
 * 	클래스를 정의할 떄 멤버변수는 private으로 선언해서 외부에서 접근할 수 없도록 정보를 은닉하고
 * `public 메소드를 통해서 접근할 수 있도록 구현한다.
*/

public class Person {
	
		@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
		private String name;		//클래스의 특성을 나타내는 데이터 - 멤버변수 or 필드
		private String addr;		//멤버변수는 특별 상황이 아니면 초기값을 주지 않는다.
									//데이터타입은 기본형, 참조형 모두 가능
		private int age;				
		
		//모든 멤버변수는 private으로 선언되어 있기 때문에 값을 설정하는 메소드와
		//값을 가져올 수 있는 메소드가 필요하다.
		//이런 역할을 하는 메소드를 정의하는 경우
		//name 변수에 값을 설정하는 메소드.
		//메소드명 : set + 멤버 변수 명(첫 글자를 대문자로 바꾼)
		// 		 setName
		public Person () {
			System.out.println("기본생성자");
		}
		public Person (String name, String addr,int age) {
			this.name = name;
			this.addr = addr;
			this.age=age;
		}
		
		
		
		
		
		public void setName(String name) { //setter메소드
			this.name = name;			//this : '나'를 지칭. 내 변수.
			
		}
		
		//name변수에 저장된 값을 호출하는 곳으로 넘겨줄 메소드
		//메소드명 : get + 멤버 변수명(첫 글자를 대문자로 바꾼)
		// 		 getName
		public String getName() {	//getter메소드
			return this.name;
		}
		
		public void setAddr(String addr) { //setter메소드
			this.addr = addr;			//this : '나'를 지칭. 내 변수.
			
		}
		public String getAddr() {	//getter메소드
			return this.addr;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		public int getAge() {
			return this.age;
		}
}
