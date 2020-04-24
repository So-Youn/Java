package chap08;
//예외가 발생하거나 발생하지않거나 반드시 실행할 명령문이 있는 경우????
// finally라는 블럭을 추가하고 정의한다.
import java.util.Scanner;

public class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {	// 오류가 발생할 가능성이 있느 블럭을 try로 묶어주기.
		System.out.println("배열의 요소 갯수를 입력하세요");
		int size = key.nextInt();
		String[] arr = new String[size];
		System.out.println("step01");
		//System.out.println(arr[0].length());
		if (size > 3) {
			arr[1] = new String("java");
		}
		System.out.println(arr[1].length());
		} catch (ArrayIndexOutOfBoundsException e) {	//블럭안에 선언된 지역변수 e (같은 것 써도 오류 안난다)
			System.out.println("배열의 요소를 잘못 액세스");
		} catch (NullPointerException e) {
			System.out.println("Null 입니다");
		} catch (Exception e) {// 모든 예외클래스의 상위클래스
			System.out.println("오류 발생!");
		}finally {
			System.out.println("반드시 실행할 명령문 - 무조건 실행.");
		}
	}
}

		