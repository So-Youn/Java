package chap08;

public class Calculator {
	double result;
	public double plus(int a, int b) {
		result = a+b;
		return result;
	}
	public double minus(int a, int b) {
		result = a-b;
		return result;
	}
	public double multiple(int a, int b) {
		result = a*b;
		return result;
		
	}
	public double divide(int a,int b) {
		try {
			result = a/b;
		}catch(Exception e) {
			System.out.println("Exception이 발생했습니다. 다시 입력해 주세요");
		}
		return result;
	}	//try~catch 먼저 실행됨.
	public void print() {
		System.out.println("결과 : "+result);
	}
}

