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
			System.out.println("Exception�� �߻��߽��ϴ�. �ٽ� �Է��� �ּ���");
		}
		return result;
	}	//try~catch ���� �����.
	public void print() {
		System.out.println("��� : "+result);
	}
}

