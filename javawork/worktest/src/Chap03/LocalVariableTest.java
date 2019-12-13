package Chap03;
//지역변수 - {} (블럭) 안에서 선언된 변수
//			선언된 블럭이 종료되면 메모리에서 해제된다.
//			1)반드시 선언된 블럭 내부에서만 사용이 가능.
//			2)반드시 초기화 작업을 해야한다.
public class LocalVariableTest {

	public static void main(String[] args) {
		int num =90;
		int sum=0;
		if(num>=90) {
			String str = new String("합격");
			sum = sum + 100; //sum변수는 main메소드 블럭에서 선언된 지역변수 이므로
							//초기화 작업을 하지않고 사용할 수 없다.
		}
		//System.out.println(str); //str변수는 if 블럭에서 선언되었으므로 if문 밖에서는 접근불가.
	}
}