package Recursion;

public class string_01 {

	public static void main(String[] args) {
		int len = length("ace");
		System.out.println("문자열 길이>>>>"+len);
		printChars("soyun"); //문자열 자르기
		printCharsReverse("reverse");
		
	}

	private static void printCharsReverse(String str) {
		if(str.length()==0)
			return;
		else {
			printCharsReverse(str.substring(1));
			System.out.println(str.charAt(0));
		}
		
	}

	public static int length(String str) {
		if (str.equals(""))
			return 0;
		else 
			return 1 + length(str.substring(1));
		// substring(1) : 원래 문자열에서 첫 글자를 제거한 나머지 문자열 보기
		// 1 + "ce"
		// 1 + "e"
		// 1 + ""
		
	}
	public static void printChars(String str) {
		if(str.length()==0)
			return;
		else {
			System.out.println(str.charAt(0));
			printChars(str.substring(1));
		}
	}

}
