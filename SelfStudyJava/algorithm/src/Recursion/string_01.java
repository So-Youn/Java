package Recursion;

public class string_01 {

	public static void main(String[] args) {
		int len = length("ace");
		System.out.println("���ڿ� ����>>>>"+len);
		printChars("soyun"); //���ڿ� �ڸ���
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
		// substring(1) : ���� ���ڿ����� ù ���ڸ� ������ ������ ���ڿ� ����
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
