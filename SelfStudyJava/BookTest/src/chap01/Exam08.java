package chap01;
import java.util.*;
//���콺�� ����
public class Exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ����"+n);
		
		int sum = (n+1)*(n/2)+(n%2==1?(n+1)/2:0);
		System.out.println( );
		System.out.println(sum);
				
	}

}
