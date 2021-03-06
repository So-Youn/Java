package oop.Chap06;

public class CallByTest {
	public static void main(String[] args) {
		//사용할 기본형 변수와 참조형 변수의 초기화
		//참조형 변수는 주소를 사용하기 때문에 같은 객체를 참조하는 것처럼된다. *겹칠 수도 있으니 조심
		CallByTest obj = new CallByTest();
		
		int i = 100;
		int[] myarr = new int[5];
		for (int j = 0; j < myarr.length; j++) {
			myarr[j] = 100;
		}
		System.out.println("===========Change 호출 전=============");
		obj.display(i,myarr);
		obj.change(i, myarr);
		System.out.println("===========Change 호출 후===========");
		obj.display(i, myarr);
	}	
		//매개변수로 전달된 num 값과 myarr가 참조하는 배열의 요소 값을 출력하는 메소드
		public void display(int num, int[] myarr) {
			System.out.println("i="+num);
			System.out.println("myarr의 요소 값");
			for (int i = 0; i < myarr.length; i++) {
				System.out.print(myarr[i]+"\t");
			}
			System.out.println( );
		}
		//매개변수로 전달된 i와 myarr가 참조하는 배열의 요소값을 변경하는 메소드
		public void change(int i, int[] myarr) {
			i=200;
			myarr[1] = 200;
		}
		
}
