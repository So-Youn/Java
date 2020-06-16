package Recursion;

public class fibonacci {

	public static void main(String[] args) {
		int result = fibonacci(10);
		System.out.println(result);

	}

	private static int fibonacci(int n) {
		if(n<2)
			return n;
		else 
			return fibonacci(n-1) + fibonacci(n-2);
		
	}

}
