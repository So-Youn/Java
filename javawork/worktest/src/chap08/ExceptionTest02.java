package chap08;
//try~catch로 예외 처리
public class ExceptionTest02 {
	public static void main(String[] args) {
		try {
			System.out.println("*************프로그램 시작**************");
			System.out.println(10 / 0); // 예외가 발생할 수 있는 문장- 이 시점에서 catch블록으로 넘어감.
			System.out.println("*************프로그램 종료**************");
		} catch (ArithmeticException e) {
			System.out.println("오류발생....");
			System.out.println("예외 메시지:" +e.getMessage());
			e.printStackTrace();//void (오류 추적의 기능)
			}
	}

}
