package Recursion;

public class recursion01 {
	public static void main(String[] args) {
		int n=4;
		func(n);
	}

	private static void func(int k) {
		if(k<=0)
			return;
		else {
			System.out.println("Hello...Recursion....");
			func(k-1);
		}
	}
	
}
