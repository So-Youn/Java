package Chap03;

import java.util.Random;

public class RandTest01 {

	public static void main(String[] args) {
	Random rand = new Random();
	int randVal = rand.nextInt(100);
	System.out.println("랜덤 숫자 출력하기 : "+randVal);
	
	//1. API에서 제공하는 클래스를 자바 프로그램 안에서 사용하기 위해 메모리에 올리는 작업
			//-> JVM이 인식하는 작업 공간에 할당
			//사용할클래스명(type) 변수 = new 사용할 클래스 명()
			
			/*//2. 객체(클래스를 사용하기 위해 메모리에 올려 놓은 것)의 메소드 사용하기
			 * -> 인스턴스라고 함.
			 * charAt의 실행 결과가 char타입이므로 같은 타입의 변수를 선언해서 저장.
			 * String => 문자열 조작.문자열은 index, 즉 순서가 존재
	*/		
			String str2 = new String("java programming");
			char returnVal = str2.charAt(0); //0번 위치에 있는 문자르 char타입으로 반환
			System.out.println("실행결과=>"+returnVal);
			
			/*//i love you라는 문자열을 이용해서 string객체를 생성하구
			이 문자열의 길이를 다음과 같은 형식으로 출력하세요
			문자열의 길이 =>____
			
	*/		
			String str3 = new String("i love you");
			int returnVal3 = str3.length();
			System.out.println("문자열의 길이=>"+returnVal3);
}
}

