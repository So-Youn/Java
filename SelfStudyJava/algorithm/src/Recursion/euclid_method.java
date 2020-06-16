package Recursion;

public class euclid_method {

	public static void main(String[] args) {
		int result = gcd(5,10);
		System.out.println(result);
	}

	private static int gcd(int m, int n) {
		if(m<n) {
			int tmp = m; m=n; n = tmp;
		}
		if(m%n==0)
			return n;
		else 
			return gcd(n,m%n);
	}

}
