package workbook;

public class Calc02 {
	public int calculate(int data) {
		int sum=0;
		System.out.print("¦�� :");
		for (int i=1;i<=data;i++) {
			if(i%2==0) {
				sum = sum+i;
				System.out.print(i+" ");
			}
		}
		System.out.println( );
		System.out.println("��� :"+sum);
		return sum;
	}
}
