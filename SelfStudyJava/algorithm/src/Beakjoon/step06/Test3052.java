package Beakjoon.step06;
import java.util.*;
//�� 10���� ���� �Է¹ް� �� ������ 42�� ������ ���� �������� �ߺ� �Ǵ��� üũ�ϸ� �Ǵ� ����
public class Test3052 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] remain = new int[10];
		int count=1;
		for(int i=0;i<10;i++) {
			int num = sc.nextInt();
			remain[i] = num%42;
		}
		sc.close();
		Arrays.sort(remain);
		for(int i =0;i<9;i++) { //�ߺ��� �ִ��� ����
			if(remain[i]!=remain[i+1]) {
				count++;
			}
		}
	System.out.println(count);
	}

}
