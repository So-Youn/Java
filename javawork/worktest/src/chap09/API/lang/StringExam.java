package chap09.API.lang;

public class StringExam {

	public static void main(String[] args) {
		//str1을 AVAJ로 출력되도록 구현하세요
		//단, stringBuffer의 reverse()사용하지 않기
		//String클래스의 charAt(0)과 toUpperCase()활용하기.
		//string은 refence값
		String str1 = "java";
		//한문자씩 출력
		for(int i=0;i<str1.length();i++) {
			System.out.print(str1.charAt(i));
		}
		System.out.println( );
		//거꾸로 출력
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.print(str1.charAt(i));
		}
		
		System.out.println( );
		//대문자로 출력
		String data = str1.toUpperCase();
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.print(data.charAt(i));
		}
		
	}

}
