package chap08;

//API의 메소드를 호출하는 경우
//1. API의 메소드 사용할 때 선언부에 throws가 추가되어 있으면 반드시 try~catch로 처리해야 한다.
//2. 메소드가 RuntimeException의 하위 Exception을 throws하는 경우에는 문법적으로
//   Exception에 대한 처리를 하도록 제한하지 않는다.
//   = 문법으로 제한하지는 않지만 Exception을 throws 하고 있으면 처리를 해야 한다.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest05 {
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("test.txt");
			System.out.println(fs.read());
			// Unhandled exception type FileNotFoundException
			//이 생성자는 예외 발생가능성이 있으니, 꼭 exception을 처리할 것을 경고해주는 것.
			System.out.println(Integer.parseInt("1234"));
			//System.out.println(Integer.parseInt("문자열"));
			//NumberFormatException : 문자열이지만, 숫자로 인식되어야 한다.
		}catch (FileNotFoundException e) {
			System.out.println("파일을 읽을 때 오류가 발생했습니다.");
		}catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			// 파일을 다시 선택할 수 있도록 처리
		}
	}
}
