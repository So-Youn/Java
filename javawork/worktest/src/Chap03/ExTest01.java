package Chap03;

public class ExTest01 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		//변수 a와 b는 모두 byte 타입, 이항 연산인 덧셈을 하기 전에 int로 자동 변환된다.int (4byte)를 byte(1byte)에 담아야하므로 형변환해줌. 
		char ch = 'A';
		ch = (char)(ch + 2);
		float f = 3 / 2f;
		long l = 3000 * 3000 * 3000L; //피연산자 중 하나는 long 이어야한다.
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float) d==f2; //double값을 유효숫자가 작은 float 값으로 변환해주는 것이 더 정확하다.
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);


	}

}
